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
    DISPLAYNAME varchar(455),
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
    NTK_VERSION varchar(255),
    ROUTE varchar(255),
    NAME varchar(255),
    GEOMETRY varchar(255),
    WEIGHT decimal(28, 8),
    PRODUCT_ID varchar(255),
    COMPONENT_ID uuid,
    QUANTITY decimal(28, 8),
    MATERIAL_ROUTE varchar(255),
    MATERIAL_SIZE varchar(255),
    STATUS integer,
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
    QUANTITY decimal(28, 8),
    ROUTE varchar(255),
    SLKM decimal(28, 8),
    SDRAG decimal(28, 8),
    SMET decimal(28, 8),
    SAKTIV decimal(28, 8),
    SHIM decimal(28, 8),
    KZAP decimal(28, 8),
    RATIO decimal(28, 8),
    REMARK text,
    NTK_ITEM_ID uuid,
    --
    primary key (ID)
)^
-- end EIS_NTK_BOM_ITEM
