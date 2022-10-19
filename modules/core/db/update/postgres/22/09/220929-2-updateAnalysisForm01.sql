alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_FORM_CREATOR_DIVISION foreign key (FORM_CREATOR_DIVISION_ID) references EIS_DIVISION_INDEX(ID);
create index IDX_EIS_ANALYSIS_FORM_ON_FORM_CREATOR_DIVISION on EIS_ANALYSIS_FORM (FORM_CREATOR_DIVISION_ID);