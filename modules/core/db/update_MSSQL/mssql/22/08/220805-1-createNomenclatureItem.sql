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
    NAME varchar(455),
    BLUEPRINTNAME varchar(255),
    DISPLAYNAME varchar(255),
    UOM_ID uniqueidentifier,
    IDMDM varchar(255),
    IDPDM uniqueidentifier,
    IDGAL uniqueidentifier,
    IDARM bigint,
    INFORMATION_SOURCE integer,
    IS_USED varchar(100),
    --
    primary key nonclustered (ID)
);