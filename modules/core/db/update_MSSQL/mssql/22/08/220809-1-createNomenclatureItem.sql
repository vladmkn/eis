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
);