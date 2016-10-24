/*
 * This file is generated by jOOQ.
*/
package org.ort.school.crm.jooq.model;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.ort.school.crm.jooq.model.tables.Grade;
import org.ort.school.crm.jooq.model.tables.Parent;
import org.ort.school.crm.jooq.model.tables.ParentGrade;
import org.ort.school.crm.jooq.model.tables.Role;
import org.ort.school.crm.jooq.model.tables.SchemaVersion;
import org.ort.school.crm.jooq.model.tables.User;
import org.ort.school.crm.jooq.model.tables.UserRole;
import org.ort.school.crm.jooq.model.tables.records.GradeRecord;
import org.ort.school.crm.jooq.model.tables.records.ParentGradeRecord;
import org.ort.school.crm.jooq.model.tables.records.ParentRecord;
import org.ort.school.crm.jooq.model.tables.records.RoleRecord;
import org.ort.school.crm.jooq.model.tables.records.SchemaVersionRecord;
import org.ort.school.crm.jooq.model.tables.records.UserRecord;
import org.ort.school.crm.jooq.model.tables.records.UserRoleRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<GradeRecord, Integer> IDENTITY_GRADE = Identities0.IDENTITY_GRADE;
    public static final Identity<ParentRecord, Long> IDENTITY_PARENT = Identities0.IDENTITY_PARENT;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<GradeRecord> CONSTRAINT_4 = UniqueKeys0.CONSTRAINT_4;
    public static final UniqueKey<GradeRecord> CONSTRAINT_40 = UniqueKeys0.CONSTRAINT_40;
    public static final UniqueKey<ParentRecord> CONSTRAINT_8 = UniqueKeys0.CONSTRAINT_8;
    public static final UniqueKey<ParentGradeRecord> CONSTRAINT_13D = UniqueKeys0.CONSTRAINT_13D;
    public static final UniqueKey<RoleRecord> CONSTRAINT_26 = UniqueKeys0.CONSTRAINT_26;
    public static final UniqueKey<UserRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
    public static final UniqueKey<UserRecord> CONSTRAINT_27 = UniqueKeys0.CONSTRAINT_27;
    public static final UniqueKey<UserRoleRecord> CONSTRAINT_BC1 = UniqueKeys0.CONSTRAINT_BC1;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ParentGradeRecord, ParentRecord> CONSTRAINT_1 = ForeignKeys0.CONSTRAINT_1;
    public static final ForeignKey<ParentGradeRecord, GradeRecord> CONSTRAINT_13 = ForeignKeys0.CONSTRAINT_13;
    public static final ForeignKey<UserRoleRecord, UserRecord> CONSTRAINT_B = ForeignKeys0.CONSTRAINT_B;
    public static final ForeignKey<UserRoleRecord, RoleRecord> CONSTRAINT_BC = ForeignKeys0.CONSTRAINT_BC;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<GradeRecord, Integer> IDENTITY_GRADE = createIdentity(Grade.GRADE, Grade.GRADE.ID);
        public static Identity<ParentRecord, Long> IDENTITY_PARENT = createIdentity(Parent.PARENT, Parent.PARENT.ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<GradeRecord> CONSTRAINT_4 = createUniqueKey(Grade.GRADE, "CONSTRAINT_4", Grade.GRADE.ID);
        public static final UniqueKey<GradeRecord> CONSTRAINT_40 = createUniqueKey(Grade.GRADE, "CONSTRAINT_40", Grade.GRADE.GRADE_NO, Grade.GRADE.GRADE_LETTER);
        public static final UniqueKey<ParentRecord> CONSTRAINT_8 = createUniqueKey(Parent.PARENT, "CONSTRAINT_8", Parent.PARENT.ID);
        public static final UniqueKey<ParentGradeRecord> CONSTRAINT_13D = createUniqueKey(ParentGrade.PARENT_GRADE, "CONSTRAINT_13D", ParentGrade.PARENT_GRADE.PARENT_ID, ParentGrade.PARENT_GRADE.GRADE_ID);
        public static final UniqueKey<RoleRecord> CONSTRAINT_26 = createUniqueKey(Role.ROLE, "CONSTRAINT_26", Role.ROLE.NAME);
        public static final UniqueKey<UserRecord> CONSTRAINT_2 = createUniqueKey(User.USER, "CONSTRAINT_2", User.USER.ID);
        public static final UniqueKey<UserRecord> CONSTRAINT_27 = createUniqueKey(User.USER, "CONSTRAINT_27", User.USER.USERNAME);
        public static final UniqueKey<UserRoleRecord> CONSTRAINT_BC1 = createUniqueKey(UserRole.USER_ROLE, "CONSTRAINT_BC1", UserRole.USER_ROLE.USER_ID, UserRole.USER_ROLE.ROLE);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<ParentGradeRecord, ParentRecord> CONSTRAINT_1 = createForeignKey(org.ort.school.crm.jooq.model.Keys.CONSTRAINT_8, ParentGrade.PARENT_GRADE, "CONSTRAINT_1", ParentGrade.PARENT_GRADE.PARENT_ID);
        public static final ForeignKey<ParentGradeRecord, GradeRecord> CONSTRAINT_13 = createForeignKey(org.ort.school.crm.jooq.model.Keys.CONSTRAINT_4, ParentGrade.PARENT_GRADE, "CONSTRAINT_13", ParentGrade.PARENT_GRADE.GRADE_ID);
        public static final ForeignKey<UserRoleRecord, UserRecord> CONSTRAINT_B = createForeignKey(org.ort.school.crm.jooq.model.Keys.CONSTRAINT_2, UserRole.USER_ROLE, "CONSTRAINT_B", UserRole.USER_ROLE.USER_ID);
        public static final ForeignKey<UserRoleRecord, RoleRecord> CONSTRAINT_BC = createForeignKey(org.ort.school.crm.jooq.model.Keys.CONSTRAINT_26, UserRole.USER_ROLE, "CONSTRAINT_BC", UserRole.USER_ROLE.ROLE);
    }
}