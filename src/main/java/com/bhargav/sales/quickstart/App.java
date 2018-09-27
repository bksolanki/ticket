package com.bhargav.sales.quickstart;

/**
 * Hello world!
 *
 */
import com.google.gson.Gson;
import com.bhargav.sales.quickstart.tables.Customer;
import com.bhargav.sales.quickstart.tables.Item;
import com.bhargav.sales.quickstart.tables.records.*;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Batch;
import org.jooq.Condition;
import org.jooq.SQLDialect;
import org.jooq.TableLike;
import org.jooq.impl.DSL;
import java.util.UUID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Gson gson = new Gson();
		System.out.println("Hello Worldlalal!");
		String user = System.getProperty("jdbc.user");
		String password = System.getProperty("jdbc.password");
		String url = System.getProperty("jdbc.url");
		String driver = System.getProperty("jdbc.driver");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales?serverTimezone=UTC",
					"root", "abcd1234");
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
			if(dataMap.isEmpty()){
				System.out.println("Event is sold out!");
			}
			else
			System.out.println(gson.toJson(dataMap));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter item Id to reserve");
			int quantity = 0;
			quantity = sc.nextInt();
			System.out.println("Enter itemids you want to reserve");
			int items[] = new int[quantity];
			for(int i=0;i<quantity;i++) {
				items[i] = sc.nextInt();
				
			}
			String orderid = UUID.randomUUID().toString();
			System.out.println("Enter the email address of the customer");
			String email = sc.next();
			ArrayList<ItemRecord> updates = new ArrayList<ItemRecord>();
			for(int i =0; i<quantity;i++) {
				ItemRecord record = new ItemRecord();
				record.setItemId(items[i]);
				record.setHoldComment(orderid);
				int custid =  DSL.using(connection).selectFrom(Customer.CUSTOMER).where(Customer.CUSTOMER.EMAIL.eq(email)).fetch().get(0).getCustId();
				record.setInternalnotes("" + custid);
				record.setItemStatus("ON_HOLD");
				updates.add(record);			}
			
			DSLContext dsl_context = DSL.using(connection);
			 int[] updates_data = dsl_context.batchUpdate(updates).execute();
			 for(int i =0; i< updates_data.length;i++) {
				 System.out.println(updates_data[i]);
			 }
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
