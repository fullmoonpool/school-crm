/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.ort.school.crm.jooq.model.tables.GroupStudent;


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
public class GroupStudentRecord extends TableRecordImpl<GroupStudentRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -738913739;

    /**
     * Setter for <code>PUBLIC.GROUP_STUDENT.STUDENT_ID</code>.
     */
    public void setStudentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.GROUP_STUDENT.STUDENT_ID</code>.
     */
    public Long getStudentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.GROUP_STUDENT.GROUP_ID</code>.
     */
    public void setGroupId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.GROUP_STUDENT.GROUP_ID</code>.
     */
    public Long getGroupId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return GroupStudent.GROUP_STUDENT.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return GroupStudent.GROUP_STUDENT.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupStudentRecord value1(Long value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupStudentRecord value2(Long value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupStudentRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupStudentRecord
     */
    public GroupStudentRecord() {
        super(GroupStudent.GROUP_STUDENT);
    }

    /**
     * Create a detached, initialised GroupStudentRecord
     */
    public GroupStudentRecord(Long studentId, Long groupId) {
        super(GroupStudent.GROUP_STUDENT);

        set(0, studentId);
        set(1, groupId);
    }
}
