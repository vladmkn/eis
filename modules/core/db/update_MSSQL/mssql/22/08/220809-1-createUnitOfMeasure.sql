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
);