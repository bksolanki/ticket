/**
 * This class is generated by jOOQ
 */
package com.bhargav.sales.quickstart.tables.records;


import com.bhargav.sales.quickstart.tables.Item;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ItemRecord extends UpdatableRecordImpl<ItemRecord> implements Record18<Integer, Integer, Byte, String, String, String, String, String, String, String, String, String, Integer, Double, String, Byte, Integer, Integer> {

    private static final long serialVersionUID = -1716676526;

    /**
     * Setter for <code>sales.item.Item_id</code>.
     */
    public void setItemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sales.item.Item_id</code>.
     */
    public Integer getItemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sales.item.TicketgroupId</code>.
     */
    public void setTicketgroupid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>sales.item.TicketgroupId</code>.
     */
    public Integer getTicketgroupid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>sales.item.hasPdf</code>.
     */
    public void setHaspdf(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sales.item.hasPdf</code>.
     */
    public Byte getHaspdf() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sales.item.Barcode</code>.
     */
    public void setBarcode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sales.item.Barcode</code>.
     */
    public String getBarcode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sales.item.Section</code>.
     */
    public void setSection(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sales.item.Section</code>.
     */
    public String getSection() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sales.item.irow</code>.
     */
    public void setIrow(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sales.item.irow</code>.
     */
    public String getIrow() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sales.item.Seat</code>.
     */
    public void setSeat(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sales.item.Seat</code>.
     */
    public String getSeat() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sales.item.item_status</code>.
     */
    public void setItemStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sales.item.item_status</code>.
     */
    public String getItemStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sales.item.hold_comment</code>.
     */
    public void setHoldComment(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sales.item.hold_comment</code>.
     */
    public String getHoldComment() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sales.item.InternalNotes</code>.
     */
    public void setInternalnotes(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sales.item.InternalNotes</code>.
     */
    public String getInternalnotes() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sales.item.ExternalNotes</code>.
     */
    public void setExternalnotes(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sales.item.ExternalNotes</code>.
     */
    public String getExternalnotes() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sales.item.Orderid</code>.
     */
    public void setOrderid(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sales.item.Orderid</code>.
     */
    public String getOrderid() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sales.item.Purchase_cust_id</code>.
     */
    public void setPurchaseCustId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>sales.item.Purchase_cust_id</code>.
     */
    public Integer getPurchaseCustId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>sales.item.Amount</code>.
     */
    public void setAmount(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>sales.item.Amount</code>.
     */
    public Double getAmount() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>sales.item.currency</code>.
     */
    public void setCurrency(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sales.item.currency</code>.
     */
    public String getCurrency() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sales.item.Share</code>.
     */
    public void setShare(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>sales.item.Share</code>.
     */
    public Byte getShare() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>sales.item.Invoice_id</code>.
     */
    public void setInvoiceId(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>sales.item.Invoice_id</code>.
     */
    public Integer getInvoiceId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>sales.item.event_id</code>.
     */
    public void setEventId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>sales.item.event_id</code>.
     */
    public Integer getEventId() {
        return (Integer) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, Byte, String, String, String, String, String, String, String, String, String, Integer, Double, String, Byte, Integer, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, Byte, String, String, String, String, String, String, String, String, String, Integer, Double, String, Byte, Integer, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Item.ITEM.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Item.ITEM.TICKETGROUPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return Item.ITEM.HASPDF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Item.ITEM.BARCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Item.ITEM.SECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Item.ITEM.IROW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Item.ITEM.SEAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Item.ITEM.ITEM_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Item.ITEM.HOLD_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Item.ITEM.INTERNALNOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Item.ITEM.EXTERNALNOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Item.ITEM.ORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Item.ITEM.PURCHASE_CUST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field14() {
        return Item.ITEM.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Item.ITEM.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return Item.ITEM.SHARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return Item.ITEM.INVOICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return Item.ITEM.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTicketgroupid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getHaspdf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBarcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIrow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSeat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getItemStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getHoldComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getInternalnotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getExternalnotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOrderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getPurchaseCustId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value14() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getShare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getInvoiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value1(Integer value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value2(Integer value) {
        setTicketgroupid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value3(Byte value) {
        setHaspdf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value4(String value) {
        setBarcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value5(String value) {
        setSection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value6(String value) {
        setIrow(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value7(String value) {
        setSeat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value8(String value) {
        setItemStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value9(String value) {
        setHoldComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value10(String value) {
        setInternalnotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value11(String value) {
        setExternalnotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value12(String value) {
        setOrderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value13(Integer value) {
        setPurchaseCustId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value14(Double value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value15(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value16(Byte value) {
        setShare(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value17(Integer value) {
        setInvoiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord value18(Integer value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemRecord values(Integer value1, Integer value2, Byte value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Integer value13, Double value14, String value15, Byte value16, Integer value17, Integer value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemRecord
     */
    public ItemRecord() {
        super(Item.ITEM);
    }

    /**
     * Create a detached, initialised ItemRecord
     */
    public ItemRecord(Integer itemId, Integer ticketgroupid, Byte haspdf, String barcode, String section, String irow, String seat, String itemStatus, String holdComment, String internalnotes, String externalnotes, String orderid, Integer purchaseCustId, Double amount, String currency, Byte share, Integer invoiceId, Integer eventId) {
        super(Item.ITEM);

        set(0, itemId);
        set(1, ticketgroupid);
        set(2, haspdf);
        set(3, barcode);
        set(4, section);
        set(5, irow);
        set(6, seat);
        set(7, itemStatus);
        set(8, holdComment);
        set(9, internalnotes);
        set(10, externalnotes);
        set(11, orderid);
        set(12, purchaseCustId);
        set(13, amount);
        set(14, currency);
        set(15, share);
        set(16, invoiceId);
        set(17, eventId);
    }

	@Override
	public Integer component1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer component2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Byte component3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component5() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component6() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component7() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component8() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component9() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component10() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component11() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component12() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer component13() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double component14() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component15() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Byte component16() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer component17() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer component18() {
		// TODO Auto-generated method stub
		return null;
	}
}
