create table EIS_DIVISION_INDEX (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(455),
    MASTER_ID uuid,
    NICKNAME varchar(255),
    INDEX_ varchar(100),
    --
    primary key (ID)
);