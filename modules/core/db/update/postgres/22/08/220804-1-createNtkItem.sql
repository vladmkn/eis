create table EIS_NTK_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BLUEPRINT varchar(255),
    NAME varchar(255),
    WEIGHT double precision,
    PRODUCT_ID varchar(255),
    QUANTITY double precision,
    MATERIAL_ROUTE varchar(255),
    MATERIAL_SIZE varchar(255),
    GEOMETRY varchar(255),
    --
    primary key (ID)
);