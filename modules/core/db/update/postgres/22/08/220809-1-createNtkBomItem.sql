create table EIS_NTK_BOM_ITEM (
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
    QUANTITY double precision,
    ROUTE varchar(255),
    SLKM double precision,
    SDRAG double precision,
    SMET double precision,
    SAKTIV double precision,
    SHIM double precision,
    KZAP double precision,
    RATIO double precision,
    REMARK text,
    NTK_ITEM_ID uuid,
    --
    primary key (ID)
);