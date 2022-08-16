create table EIS_TECHNICAL_FORM_COMMISSION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MEMBER_ID uuid,
    TECHNICAL_FORM_ID uuid not null,
    --
    primary key (ID)
);