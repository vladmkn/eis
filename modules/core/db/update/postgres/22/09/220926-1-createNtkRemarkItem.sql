create table EIS_NTK_REMARK_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEXT text,
    OGT boolean,
    HTS boolean,
    OME boolean,
    BMN boolean,
    NTK_ITEM_ID uuid not null,
    --
    primary key (ID)
);