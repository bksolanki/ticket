package com.bhargav.sales.quickstart;

/**
 * Hello world!
 *
 */
import com.google.gson.Gson;
import com.bhargav.sales.quickstart.tables.Item;
import com.bhargav.sales.quickstart.tables.records.ItemRecord;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Condition;
import org.jooq.SQLDialect;
import org.jooq.TableLike;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
				HashMap<String, String> seat_data = new HashMap();
				Integer item_id = r.get(Item.ITEM.ITEM_ID);
				String section = r.get(Item.ITEM.SECTION);
				String row = r.get(Item.ITEM.IROW);
				String seat = r.get(Item.ITEM.SEAT);
				Double amount = r.get(Item.ITEM.AMOUNT);
                seat_data.put("item_id", "" + item_id);
                seat_data.put("section", "" + section);
                seat_data.put("row", "" + row);
                seat_data.put("seat", "" + seat);
                seat_data.put("amount", "" + amount);
                dataMap.add(seat_data);
				

			}
			System.out.println(gson.toJson(dataMap));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
