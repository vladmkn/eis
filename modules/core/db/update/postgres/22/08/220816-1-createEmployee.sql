create table EIS_EMPLOYEE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255),
    SURNAME varchar(255),
    PATRONYMIC varchar(255),
    JOB_TITLE_ID uuid,
    --
    primary key (ID)
);