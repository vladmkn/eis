alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_DEFECT_DIVISION foreign key (DEFECT_DIVISION_ID) references EIS_DIVISION_INDEX(ID);
create index IDX_EIS_TECHNICAL_FORM_ON_DEFECT_DIVISION on EIS_TECHNICAL_FORM (DEFECT_DIVISION_ID);