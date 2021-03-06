/**
 * This class is generated by jOOQ
 */
package com.bhargav.sales.quickstart;


import com.bhargav.sales.quickstart.tables.Customer;
import com.bhargav.sales.quickstart.tables.Event;
import com.bhargav.sales.quickstart.tables.Item;
import com.bhargav.sales.quickstart.tables.records.CustomerRecord;
import com.bhargav.sales.quickstart.tables.records.EventRecord;
import com.bhargav.sales.quickstart.tables.records.ItemRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>sales</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CustomerRecord, Integer> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
    public static final Identity<EventRecord, Integer> IDENTITY_EVENT = Identities0.IDENTITY_EVENT;
    public static final Identity<ItemRecord, Integer> IDENTITY_ITEM = Identities0.IDENTITY_ITEM;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_PRIMARY = UniqueKeys0.KEY_CUSTOMER_PRIMARY;
    public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = UniqueKeys0.KEY_EVENT_PRIMARY;
    public static final UniqueKey<ItemRecord> KEY_ITEM_PRIMARY = UniqueKeys0.KEY_ITEM_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CustomerRecord, Integer> IDENTITY_CUSTOMER = createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.CUST_ID);
        public static Identity<EventRecord, Integer> IDENTITY_EVENT = createIdentity(Event.EVENT, Event.EVENT.EVENT_ID);
        public static Identity<ItemRecord, Integer> IDENTITY_ITEM = createIdentity(Item.ITEM, Item.ITEM.ITEM_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_PRIMARY = createUniqueKey(Customer.CUSTOMER, "KEY_Customer_PRIMARY", Customer.CUSTOMER.CUST_ID);
        public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = createUniqueKey(Event.EVENT, "KEY_Event_PRIMARY", Event.EVENT.EVENT_ID);
        public static final UniqueKey<ItemRecord> KEY_ITEM_PRIMARY = createUniqueKey(Item.ITEM, "KEY_item_PRIMARY", Item.ITEM.ITEM_ID);
    }
}
