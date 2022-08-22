create table EIS_TECHNICAL_FORM_COMPONENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COMPONENT_ID uuid,
    COMPONENT_NUMBER varchar(255),
    TECHNICAL_FORM_ID uuid not null,
    --
    primary key (ID)
);