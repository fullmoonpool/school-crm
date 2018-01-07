/*
 * This file is generated by jOOQ.
*/
package org.ort.school.crm.jooq.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.ort.school.crm.jooq.model.Indexes;
import org.ort.school.crm.jooq.model.Keys;
import org.ort.school.crm.jooq.model.Public;
import org.ort.school.crm.jooq.model.tables.records.ParentStudentRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParentStudent extends TableImpl<ParentStudentRecord> {

    private static final long serialVersionUID = 2047832513;

    /**
     * The reference instance of <code>PUBLIC.PARENT_STUDENT</code>
     */
    public static final ParentStudent PARENT_STUDENT = new ParentStudent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParentStudentRecord> getRecordType() {
        return ParentStudentRecord.class;
    }

    /**
     * The column <code>PUBLIC.PARENT_STUDENT.PARENT_ID</code>.
     */
    public final TableField<ParentStudentRecord, Long> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.PARENT_STUDENT.STUDENT_ID</code>.
     */
    public final TableField<ParentStudentRecord, Long> STUDENT_ID = createField("STUDENT_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.PARENT_STUDENT</code> table reference
     */
    public ParentStudent() {
        this(DSL.name("PARENT_STUDENT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.PARENT_STUDENT</code> table reference
     */
    public ParentStudent(String alias) {
        this(DSL.name(alias), PARENT_STUDENT);
    }

    /**
     * Create an aliased <code>PUBLIC.PARENT_STUDENT</code> table reference
     */
    public ParentStudent(Name alias) {
        this(alias, PARENT_STUDENT);
    }

    private ParentStudent(Name alias, Table<ParentStudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ParentStudent(Name alias, Table<ParentStudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_19, Indexes.CONSTRAINT_INDEX_194, Indexes.PRIMARY_KEY_19, Indexes.P_S_PID, Indexes.P_S_SID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ParentStudentRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_194D;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ParentStudentRecord>> getKeys() {
        return Arrays.<UniqueKey<ParentStudentRecord>>asList(Keys.CONSTRAINT_194D);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ParentStudentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ParentStudentRecord, ?>>asList(Keys.CONSTRAINT_19, Keys.CONSTRAINT_194);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentStudent as(String alias) {
        return new ParentStudent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParentStudent as(Name alias) {
        return new ParentStudent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ParentStudent rename(String name) {
        return new ParentStudent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ParentStudent rename(Name name) {
        return new ParentStudent(name, null);
    }
}