alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_DEFECT_DIVISION foreign key (DEFECT_DIVISION_ID) references EIS_DIVISION_INDEX(ID);
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID);
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_MANUFACTURER foreign key (MANUFACTURER_ID) references EIS_DIVISION_INDEX(ID);
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_DEVELOPER foreign key (DEVELOPER_ID) references EIS_DIVISION_INDEX(ID);
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_PRODUCT foreign key (PRODUCT_ID) references EIS_PRODUCT(ID);
create index IDX_EIS_ANALYSIS_FORM_ON_DEFECT_DIVISION on EIS_ANALYSIS_FORM (DEFECT_DIVISION_ID);
create index IDX_EIS_ANALYSIS_FORM_ON_COMPONENT on EIS_ANALYSIS_FORM (COMPONENT_ID);
create index IDX_EIS_ANALYSIS_FORM_ON_MANUFACTURER on EIS_ANALYSIS_FORM (MANUFACTURER_ID);
create index IDX_EIS_ANALYSIS_FORM_ON_DEVELOPER on EIS_ANALYSIS_FORM (DEVELOPER_ID);
create index IDX_EIS_ANALYSIS_FORM_ON_PRODUCT on EIS_ANALYSIS_FORM (PRODUCT_ID);