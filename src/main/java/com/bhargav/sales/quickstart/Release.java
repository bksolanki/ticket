package com.bhargav.sales.quickstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.jooq.DSLContext;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.bhargav.sales.quickstart.tables.records.ItemRecord;

public class Release implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales?serverTimezone=UTC",
					"root", "abcd1234");
			DSLContext release_context = DSL.using(connection);
			Integer current = (int) System.currentTimeMillis() / 1000;
			String get_items_sql = "select item_id from items_reserve where hold_expire < " + current;
			Result<Record> expired = release_context.fetch(get_items_sql);
			ArrayList<ItemRecord> dataMap = new ArrayList<>();
			for (Record r : expired) {
				Integer itemId = (Integer) r.getValue(0);
				ItemRecord record = new ItemRecord();
				record.setItemId(itemId);
				record.setItemStatus("available");
				record.setHoldComment(null);

				dataMap.add(record);
			}
			release_context.batchUpdate(dataMap).execute();
			if (!dataMap.isEmpty()) {
				System.out.println("Release succesful for  " + dataMap.toString());
			}
			String release_holds_sql = "Delete from items_reserve where hold_expire < " + current;
			release_context.execute(release_holds_sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}