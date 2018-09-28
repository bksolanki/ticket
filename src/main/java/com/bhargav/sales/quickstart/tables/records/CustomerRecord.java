/**
 * This class is generated by jOOQ
 */
package com.bhargav.sales.quickstart.tables.records;


import com.bhargav.sales.quickstart.tables.Customer;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record6<Integer, String, String, String, String, String> {

    private static final long serialVersionUID = -237813192;

    /**
     * Setter for <code>sales.Customer.cust_id</code>.
     */
    public void setCustId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sales.Customer.cust_id</code>.
     */
    public Integer getCustId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sales.Customer.LastName</code>.
     */
    public void setLastname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sales.Customer.LastName</code>.
     */
    public String getLastname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sales.Customer.FirstName</code>.
     */
    public void setFirstname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sales.Customer.FirstName</code>.
     */
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sales.Customer.Address</code>.
     */
    public void setAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sales.Customer.Address</code>.
     */
    public String getAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sales.Customer.City</code>.
     */
    public void setCity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sales.Customer.City</code>.
     */
    public String getCity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sales.Customer.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sales.Customer.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Customer.CUSTOMER.CUST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Customer.CUSTOMER.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Customer.CUSTOMER.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Customer.CUSTOMER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCustId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value1(Integer value) {
        setCustId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value2(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value4(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value5(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Integer custId, String lastname, String firstname, String address, String city, String email) {
        super(Customer.CUSTOMER);

        set(0, custId);
        set(1, lastname);
        set(2, firstname);
        set(3, address);
        set(4, city);
        set(5, email);
    }

	@Override
	public Integer component1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String component3() {
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
}
