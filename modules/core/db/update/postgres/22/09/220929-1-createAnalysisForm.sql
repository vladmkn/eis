create table EIS_ANALYSIS_FORM (
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
    DEFECT_DIVISION_ID uuid,
    COMPONENT_ID uuid,
    COMPONENT_NUMBER varchar(300),
    QUANTITY decimal(28, 8),
    ASSEMBLY_NUM varchar(255),
    MANUFACTURER_ID uuid,
    DEVELOPER_ID uuid,
    DEFECT_DIVISION_DEF varchar(300),
    DEFECT_DATE date,
    DEFECT_CONDITIONS text,
    DEFECT_DEFINITION text,
    DEFECT_MUST_BE text,
    DEFECT_AS_IS text,
    INSPECTION_RESULTS text,
    MANUFACTURE_DATE date,
    PRODUCT_ID uuid,
    PRODUCT_NUMBER varchar(300),
    MASTER_COMPONENT_DEFINITION varchar(300),
    MASTER_COMPONENT_NUMBER varchar(300),
    --
    primary key (ID)
);