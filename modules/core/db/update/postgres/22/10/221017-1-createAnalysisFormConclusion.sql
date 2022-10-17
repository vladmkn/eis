create table EIS_ANALYSIS_FORM_CONCLUSION (
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
    FINALDATE varchar(300),
    RECIPIENT varchar(300),
    ADDRESS varchar(300),
    FAX varchar(300),
    PHONE varchar(300),
    --
    primary key (ID)
);