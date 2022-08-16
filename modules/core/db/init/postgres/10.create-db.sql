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
-- begin EIS_TECHNICAL_FORM
create table EIS_TECHNICAL_FORM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DOCUMENT_NUM varchar(255),
    DOCUMENT_DATE date,
    EXTERNAL_DOCUMENT boolean,
    COMPONENT_ID uuid,
    COMPONENT_NUMBER varchar(300),
    QUANTITY decimal(28, 8),
    PRODUCT_ID uuid,
    PRODUCT_NUMBER varchar(300),
    MANUFACTURER varchar(300),
    CONTRACT varchar(300),
    PROVIDER varchar(300),
    ASSEMBLY_NUM varchar(255),
    MASTER_COMPONENT_DEFINITION varchar(300),
    MASTER_COMPONENT_NUMBER varchar(300),
    WARRANTY_START_DATE date,
    WARRANTY_PERIOD varchar(455),
    DEFECT_DIVISION_ID uuid,
    DEFECT_DATE date,
    DEFECT_CONDITIONS text,
    DEFECT_DEFINITION text,
    DEFECT_CAUSE text,
    INSPECTION_RESULTS text,
    --
    primary key (ID)
)^
-- end EIS_TECHNICAL_FORM
-- begin EIS_PRODUCT
create table EIS_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    SERIES varchar(100),
    ASSEMBLY_MASK varchar(255),
    --
    primary key (ID)
)^
-- end EIS_PRODUCT
-- begin EIS_JOB_TITLE
create table EIS_JOB_TITLE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end EIS_JOB_TITLE
-- begin EIS_EMPLOYEE
create table EIS_EMPLOYEE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255),
    SURNAME varchar(255),
    PATRONYMIC varchar(255),
    JOB_TITLE_ID uuid,
    --
    primary key (ID)
)^
-- end EIS_EMPLOYEE
-- begin EIS_TECHNICAL_FORM_COMMISSION
create table EIS_TECHNICAL_FORM_COMMISSION (
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
    TECHNICAL_FORM_ID uuid not null,
    --
    primary key (ID)
)^
-- end EIS_TECHNICAL_FORM_COMMISSION
-- begin EIS_DIVISION_INDEX
create table EIS_DIVISION_INDEX (
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
    MASTER_ID uuid,
    NICKNAME varchar(255),
    INDEX_ varchar(100),
    --
    primary key (ID)
)^
-- end EIS_DIVISION_INDEX
-- begin EIS_TECHNICAL_FORM_CONCLUSION
create table EIS_TECHNICAL_FORM_CONCLUSION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEFINITION_ text,
    ACCOUNTABLE_ID uuid,
    FINALDATE date,
    ADDRESS varchar(300),
    RECIPIENT varchar(300),
    FAX varchar(300),
    PHONE varchar(300),
    TECHNICAL_FORM_ID uuid not null,
    --
    primary key (ID)
)^
-- end EIS_TECHNICAL_FORM_CONCLUSION
