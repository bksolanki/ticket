/**
 * This class is generated by jOOQ
 */
package com.bhargav.sales.quickstart;


import com.bhargav.sales.quickstart.tables.Customer;
import com.bhargav.sales.quickstart.tables.Event;
import com.bhargav.sales.quickstart.tables.Item;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in sales
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>sales.Customer</code>.
     */
    public static final Customer CUSTOMER = com.bhargav.sales.quickstart.tables.Customer.CUSTOMER;

    /**
     * The table <code>sales.Event</code>.
     */
    public static final Event EVENT = com.bhargav.sales.quickstart.tables.Event.EVENT;

    /**
     * The table <code>sales.item</code>.
     */
    public static final Item ITEM = com.bhargav.sales.quickstart.tables.Item.ITEM;
}
