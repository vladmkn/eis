create table EIS_TECHNICAL_FORM_CONCLUSION2 (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEFINITION_ text,
    ACCOUNTABLE_ID uuid,
    FINALDATE varchar(300),
    TECHNICAL_FORM_ID uuid not null,
    --
    primary key (ID)
);