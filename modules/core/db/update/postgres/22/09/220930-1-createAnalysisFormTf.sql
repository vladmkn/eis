create table EIS_ANALYSIS_FORM_TF (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TECHNICAL_FORM_ID uuid,
    DEFINITION_ text,
    ANALYSIS_FORM_ID uuid not null,
    --
    primary key (ID)
);