-- begin EIS_UNIT_OF_MEASURE
create table EIS_UNIT_OF_MEASURE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NICKNAME varchar(100),
    FULLNAME varchar(255),
    IDPDM uuid,
    IDGAL uuid,
    IDMDM varchar(255),
    IDARM bigint,
    INFORMATION_SOURCE integer,
    --
    primary key (ID)
)^
-- end EIS_UNIT_OF_MEASURE
-- begin EIS_NOMENCLATURE_ITEM
create table EIS_NOMENCLATURE_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(455),
    BLUEPRINTNAME varchar(255),
    DISPLAYNAME varchar(255),
    UOM_ID uuid,
    IDMDM varchar(255),
    IDPDM uuid,
    IDGAL uuid,
    IDARM bigint,
    INFORMATION_SOURCE integer,
    IS_USED varchar(100),
    --
    primary key (ID)
)^
-- end EIS_NOMENCLATURE_ITEM
-- begin EIS_NTK_ITEM
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
    GEOMETRY varchar(255),
    WEIGHT double precision,
    PRODUCT_ID varchar(255),
    COMPONENT_ID uuid,
    QUANTITY double precision,
    MATERIAL_ROUTE varchar(255),
    MATERIAL_SIZE varchar(255),
    --
    primary key (ID)
)^
-- end EIS_NTK_ITEM
-- begin EIS_NTK_BOM_ITEM
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
)^
-- end EIS_NTK_BOM_ITEM
