create table EIS_ANALYSIS_FORM_CONCLUSION_AL (
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
    ANALYSIS_FORM_CONCLUSION_ID uuid not null,
    --
    primary key (ID)
);