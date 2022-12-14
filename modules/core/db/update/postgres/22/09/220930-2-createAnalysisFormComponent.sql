alter table EIS_ANALYSIS_FORM_COMPONENT add constraint FK_EIS_ANALYSIS_FORM_COMPONENT_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID);
alter table EIS_ANALYSIS_FORM_COMPONENT add constraint FK_EIS_ANALYSIS_FORM_COMPONENT_ON_ANALYSIS_FORM foreign key (ANALYSIS_FORM_ID) references EIS_ANALYSIS_FORM(ID);
create index IDX_EIS_ANALYSIS_FORM_COMPONENT_ON_COMPONENT on EIS_ANALYSIS_FORM_COMPONENT (COMPONENT_ID);
create index IDX_EIS_ANALYSIS_FORM_COMPONENT_ON_ANALYSIS_FORM on EIS_ANALYSIS_FORM_COMPONENT (ANALYSIS_FORM_ID);
