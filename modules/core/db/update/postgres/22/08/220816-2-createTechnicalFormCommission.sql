alter table EIS_TECHNICAL_FORM_COMMISSION add constraint FK_EIS_TECHNICAL_FORM_COMMISSION_ON_MEMBER foreign key (MEMBER_ID) references EIS_EMPLOYEE(ID);
alter table EIS_TECHNICAL_FORM_COMMISSION add constraint FK_EIS_TECHNICAL_FORM_COMMISSION_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID);
create index IDX_EIS_TECHNICAL_FORM_COMMISSION_ON_MEMBER on EIS_TECHNICAL_FORM_COMMISSION (MEMBER_ID);
create index IDX_EIS_TECHNICAL_FORM_COMMISSION_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_COMMISSION (TECHNICAL_FORM_ID);
