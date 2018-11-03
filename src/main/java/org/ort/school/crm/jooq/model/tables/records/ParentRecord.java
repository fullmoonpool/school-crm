/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.ort.school.crm.jooq.model.tables.Parent;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParentRecord extends UpdatableRecordImpl<ParentRecord> implements Record5<Long, String, String, String, String> {

    private static final long serialVersionUID = -1035791197;

    /**
     * Setter for <code>PUBLIC.PARENT.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.PARENT.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.PARENT.LASTNAME</code>.
     */
    public void setLastname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.PARENT.LASTNAME</code>.
     */
    public String getLastname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.PARENT.FIRSTNAME</code>.
     */
    public void setFirstname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.PARENT.FIRSTNAME</code>.
     */
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.PARENT.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.PARENT.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.PARENT.PATRONYMIC</code>.
     */
    public void setPatronymic(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.PARENT.PATRONYMIC</code>.
     */
    public String getPatronymic() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Parent.PARENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Parent.PARENT.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Parent.PARENT.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Parent.PARENT.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Parent.PARENT.PATRONYMIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPatronymic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
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
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPatronymic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentRecord value2(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentRecord value5(String value) {
        setPatronymic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentRecord values(Long value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParentRecord
     */
    public ParentRecord() {
        super(Parent.PARENT);
    }

    /**
     * Create a detached, initialised ParentRecord
     */
    public ParentRecord(Long id, String lastname, String firstname, String email, String patronymic) {
        super(Parent.PARENT);

        set(0, id);
        set(1, lastname);
        set(2, firstname);
        set(3, email);
        set(4, patronymic);
    }
}
