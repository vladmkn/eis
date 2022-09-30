create table EIS_ANALYSIS_FORM_COMPONENT (
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
    QUANTITY decimal(28, 8),
    ANALYSIS_FORM_ID uuid not null,
    --
    primary key (ID)
);