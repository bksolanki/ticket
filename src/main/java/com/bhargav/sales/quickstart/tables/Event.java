/**
 * This class is generated by jOOQ
 */
package com.bhargav.sales.quickstart.tables;


import com.bhargav.sales.quickstart.Keys;
import com.bhargav.sales.quickstart.Sales;
import com.bhargav.sales.quickstart.tables.records.EventRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Event extends TableImpl<EventRecord> {

    private static final long serialVersionUID = 650474432;

    /**
     * The reference instance of <code>sales.Event</code>
     */
    public static final Event EVENT = new Event();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventRecord> getRecordType() {
        return EventRecord.class;
    }

    /**
     * The column <code>sales.Event.event_id</code>.
     */
    public final TableField<EventRecord, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sales.Event.Artist</code>.
     */
    public final TableField<EventRecord, String> ARTIST = createField("Artist", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sales.Event.venue</code>.
     */
    public final TableField<EventRecord, String> VENUE = createField("venue", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sales.Event.event_date_time</code>.
     */
    public final TableField<EventRecord, Timestamp> EVENT_DATE_TIME = createField("event_date_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sales.Event.City</code>.
     */
    public final TableField<EventRecord, String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sales.Event.state</code>.
     */
    public final TableField<EventRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sales.Event.event_name</code>.
     */
    public final TableField<EventRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>sales.Event</code> table reference
     */
    public Event() {
        this("Event", null);
    }

    /**
     * Create an aliased <code>sales.Event</code> table reference
     */
    public Event(String alias) {
        this(alias, EVENT);
    }

    private Event(String alias, Table<EventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Event(String alias, Table<EventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sales.SALES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EventRecord> getPrimaryKey() {
        return Keys.KEY_EVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventRecord>> getKeys() {
        return Arrays.<UniqueKey<EventRecord>>asList(Keys.KEY_EVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Event as(String alias) {
        return new Event(alias, this);
    }

    /**
     * Rename this table
     */
    public Event rename(String name) {
        return new Event(name, null);
    }
}
