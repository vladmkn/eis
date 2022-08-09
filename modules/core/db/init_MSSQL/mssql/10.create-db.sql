-- begin EIS_UNIT_OF_MEASURE
create table EIS_UNIT_OF_MEASURE (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NICKNAME nvarchar(100),
    FULLNAME nvarchar(255),
    IDPDM uniqueidentifier,
    IDGAL uniqueidentifier,
    IDMDM nvarchar(100),
    IDARM bigint,
    INFORMATION_SOURCE integer,
    LOAD_TS datetime2,
    --
    primary key nonclustered (ID)
)^
-- end EIS_UNIT_OF_MEASURE
-- begin EIS_NOMENCLATURE_ITEM
create table EIS_NOMENCLATURE_ITEM (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME nvarchar(455),
    BLUEPRINTNAME nvarchar(255),
    DISPLAYNAME nvarchar(455),
    UOM_ID uniqueidentifier,
    IDMDM nvarchar(100),
    IDPDM uniqueidentifier,
    IDGAL uniqueidentifier,
    IDARM bigint,
    INFORMATION_SOURCE integer,
    IS_USED nvarchar(255),
    LOAD_TS datetime2,
    --
    primary key nonclustered (ID)
)^
-- end EIS_NOMENCLATURE_ITEM
