package com.bhargav.sales.quickstart;

/**
 * Tickets!
 *
 */
import com.google.gson.Gson;
import com.bhargav.sales.quickstart.tables.Customer;
import com.bhargav.sales.quickstart.tables.Item;
import com.bhargav.sales.quickstart.tables.records.*;
import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import java.util.UUID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.bhargav.sales.quickstart.Release;

public class App {

	private static Scanner sc;

	public static void main(String[] args) {
		Gson gson = new Gson();
		JobDetail release_job = JobBuilder.newJob(Release.class).withIdentity("Release", "Release").build();
		Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("cronTrigger1", "group1")
				.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

		Scheduler scheduler1;
		try {
			scheduler1 = new StdSchedulerFactory().getScheduler();
			scheduler1.start();
			scheduler1.scheduleJob(release_job, trigger1);
		} catch (SchedulerException e1) {
			e1.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales?serverTimezone=UTC",
					"root", "abcd1234");
			
			//Qeury to get available seats. Ideally, should be in "getAvailableSeats" function
			Result<ItemRecord> result = DSL.using(connection).selectFrom(Item.ITEM)
					.where(Item.ITEM.ITEM_STATUS.eq("available").and(Item.ITEM.SHARE.eq((byte) 1))).fetch();
			ArrayList<HashMap<String, String>> dataMap = new ArrayList<HashMap<String, String>>();
			for (ItemRecord r : result) {
				HashMap<String, String> seat_data = new HashMap<String, String>();
				Integer itemId = r.get(Item.ITEM.ITEM_ID);
				String section = r.get(Item.ITEM.SECTION);
				String row = r.get(Item.ITEM.IROW);
				String seat = r.get(Item.ITEM.SEAT);
				Double amount = r.get(Item.ITEM.AMOUNT);
				seat_data.put("item_id", "" + itemId);
				seat_data.put("section", "" + section);
				seat_data.put("row", "" + row);
				seat_data.put("seat", "" + seat);
				seat_data.put("amount", "" + amount);
				dataMap.add(seat_data);

			}
			if (dataMap.isEmpty()) {
				System.out.println("Event is sold out!");
			} else {
				System.out.println("Items available");
				System.out.println(gson.toJson(dataMap));
			}
			// This part should reside in the function "putHold"
			sc = new Scanner(System.in);
			System.out.println("Enter Number of items to reserve");
			int quantity = 0;
			quantity = sc.nextInt();
			System.out.println("Enter itemids you want to reserve");
			int items[] = new int[quantity];
			for (int i = 0; i < quantity; i++) {
				items[i] = sc.nextInt();

			}
			String orderid = UUID.randomUUID().toString();

			System.out.println("Enter the email address of the customer");
			String email = sc.next();
			ArrayList<ItemRecord> updates = new ArrayList<ItemRecord>();
			for (int i = 0; i < quantity; i++) {
				ItemRecord record = new ItemRecord();
				record.setItemId(items[i]);
				record.setHoldComment(orderid);
				int custid = DSL.using(connection).selectFrom(Customer.CUSTOMER)
						.where(Customer.CUSTOMER.EMAIL.eq(email)).fetch().get(0).getCustId();
				record.setInternalnotes("" + custid);
				record.setItemStatus("ON_HOLD");
				Integer hold_length = (int) ((System.currentTimeMillis() + 60000) / 1000);
				String sql = String.format(
						"insert into items_reserve(orderid, item_id, hold_expire, hold_cust_id) values(\'%s\', %d, %d, %d)",
						orderid, items[i], hold_length, custid);
				DSL.using(connection).execute(sql);
				updates.add(record);

			}

			DSLContext dsl_context = DSL.using(connection);
			int[] updates_data = dsl_context.batchUpdate(updates).execute();
			for (int i = 0; i < updates_data.length; i++) {
				System.out.println(updates_data[i]);
			}
			System.out.println("Your hold was successful: \nOrderid:" + orderid); 
			
			//Hold process ends here
			//Purchase/Invoice process begins here. Must ideally reside in function "doPurchase"
			System.out.println("Purchase your your holds in  less than 60 .Enter Orderid");
			String inputOrderId = sc.next();
			System.out.println("Enter the email address for held order");
			String inputEmail = sc.next();
			String invoiceuuid = UUID.randomUUID().toString();
			int invoiceId = invoiceuuid.hashCode();
			int invoice_custid = DSL.using(connection).selectFrom(Customer.CUSTOMER)
					.where(Customer.CUSTOMER.EMAIL.eq(inputEmail)).fetch().get(0).getCustId();
			String get_items_sql = String.format(
					"select item_id from items_reserve where orderid = \'%s\' and hold_cust_id = %d", inputOrderId,
					invoice_custid);
			Result<Record> itemsToInvoice = dsl_context.fetch(get_items_sql);
			ArrayList<ItemRecord> invoiceList = new ArrayList<>();
			for (Record r : itemsToInvoice) {
				Integer itemId = (Integer) r.getValue(0);
				ItemRecord record = new ItemRecord();
				record.setItemId(itemId);
				record.setItemStatus("sold");
				record.setPurchaseCustId(invoice_custid);
				record.setInvoiceId(invoiceId);
				record.setOrderid(inputOrderId);
				record.setHoldComment(null);

				invoiceList.add(record);
			}
			dsl_context.batchUpdate(invoiceList).execute();
			if (invoiceList.isEmpty()) {
				System.out.println("Invoice failure. No items reserved for that orderid and custid combination");
			} else {
				System.out.println("Invoice successful for orderid: " + inputOrderId + " Invoiceid :" + invoiceId);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
