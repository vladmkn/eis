create table EIS_ANALYSIS_FORM_FILE_DESCRIPTOR_LINK (
    ANALYSIS_FORM_ID uuid,
    FILE_DESCRIPTOR_ID uuid,
    primary key (ANALYSIS_FORM_ID, FILE_DESCRIPTOR_ID)
);