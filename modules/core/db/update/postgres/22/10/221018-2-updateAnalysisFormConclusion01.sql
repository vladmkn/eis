alter table EIS_ANALYSIS_FORM_CONCLUSION add constraint FK_EIS_ANALYSIS_FORM_CONCLUSION_ON_ANALYSIS_FORM foreign key (ANALYSIS_FORM_ID) references EIS_ANALYSIS_FORM(ID);
create index IDX_EIS_ANALYSIS_FORM_CONCLUSION_ON_ANALYSIS_FORM on EIS_ANALYSIS_FORM_CONCLUSION (ANALYSIS_FORM_ID);
