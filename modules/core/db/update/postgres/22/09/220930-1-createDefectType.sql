create table EIS_DEFECT_TYPE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GROUP_CODE varchar(10),
    TYPE_CODE varchar(10),
    ABBR varchar(10),
    DEFINITION_ varchar(255),
    CODE varchar(10),
    --
    primary key (ID)
);