-- begin EIS_NOMENCLATURE_ITEM
alter table EIS_NOMENCLATURE_ITEM add constraint FK_EIS_NOMENCLATURE_ITEM_ON_UOM foreign key (UOM_ID) references EIS_UNIT_OF_MEASURE(ID)^
create index IDX_EIS_NOMENCLATURE_ITEM_ON_UOM on EIS_NOMENCLATURE_ITEM (UOM_ID)^
create index IDX_EIS_NOMENCLATURE_ITEM_IDGAL on EIS_NOMENCLATURE_ITEM (IDGAL)^
create index IDX_EIS_NOMENCLATURE_ITEM_NAME on EIS_NOMENCLATURE_ITEM (NAME)^
-- end EIS_NOMENCLATURE_ITEM
-- begin EIS_NTK_BOM_ITEM
alter table EIS_NTK_BOM_ITEM add constraint FK_EIS_NTK_BOM_ITEM_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID)^
alter table EIS_NTK_BOM_ITEM add constraint FK_EIS_NTK_BOM_ITEM_ON_NTK_ITEM foreign key (NTK_ITEM_ID) references EIS_NTK_ITEM(ID)^
create index IDX_EIS_NTK_BOM_ITEM_ON_COMPONENT on EIS_NTK_BOM_ITEM (COMPONENT_ID)^
create index IDX_EIS_NTK_BOM_ITEM_ON_NTK_ITEM on EIS_NTK_BOM_ITEM (NTK_ITEM_ID)^
-- end EIS_NTK_BOM_ITEM
-- begin EIS_NTK_ITEM
alter table EIS_NTK_ITEM add constraint FK_EIS_NTK_ITEM_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID)^
create index IDX_EIS_NTK_ITEM_ON_COMPONENT on EIS_NTK_ITEM (COMPONENT_ID)^
-- end EIS_NTK_ITEM
-- begin EIS_TECHNICAL_FORM
alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID)^
alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_PRODUCT foreign key (PRODUCT_ID) references EIS_PRODUCT(ID)^
alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_MANUFACTURER foreign key (MANUFACTURER_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_DEFECT_DIVISION foreign key (DEFECT_DIVISION_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_EXECUTOR_S2 foreign key (EXECUTOR_S2_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_TECHNICAL_FORM add constraint FK_EIS_TECHNICAL_FORM_ON_EXECUTOR_S1 foreign key (EXECUTOR_S1_ID) references EIS_DIVISION_INDEX(ID)^
create index IDX_EIS_TECHNICAL_FORM_ON_COMPONENT on EIS_TECHNICAL_FORM (COMPONENT_ID)^
create index IDX_EIS_TECHNICAL_FORM_ON_PRODUCT on EIS_TECHNICAL_FORM (PRODUCT_ID)^
create index IDX_EIS_TECHNICAL_FORM_ON_MANUFACTURER on EIS_TECHNICAL_FORM (MANUFACTURER_ID)^
create index IDX_EIS_TECHNICAL_FORM_ON_DEFECT_DIVISION on EIS_TECHNICAL_FORM (DEFECT_DIVISION_ID)^
create index IDX_EIS_TECHNICAL_FORM_ON_EXECUTOR_S2 on EIS_TECHNICAL_FORM (EXECUTOR_S2_ID)^
create index IDX_EIS_TECHNICAL_FORM_ON_EXECUTOR_S1 on EIS_TECHNICAL_FORM (EXECUTOR_S1_ID)^
-- end EIS_TECHNICAL_FORM
-- begin EIS_EMPLOYEE
alter table EIS_EMPLOYEE add constraint FK_EIS_EMPLOYEE_ON_JOB_TITLE foreign key (JOB_TITLE_ID) references EIS_JOB_TITLE(ID)^
create index IDX_EIS_EMPLOYEE_ON_JOB_TITLE on EIS_EMPLOYEE (JOB_TITLE_ID)^
-- end EIS_EMPLOYEE
-- begin EIS_TECHNICAL_FORM_COMMISSION
alter table EIS_TECHNICAL_FORM_COMMISSION add constraint FK_EIS_TECHNICAL_FORM_COMMISSION_ON_MEMBER foreign key (MEMBER_ID) references EIS_EMPLOYEE(ID)^
alter table EIS_TECHNICAL_FORM_COMMISSION add constraint FK_EIS_TECHNICAL_FORM_COMMISSION_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
create index IDX_EIS_TECHNICAL_FORM_COMMISSION_ON_MEMBER on EIS_TECHNICAL_FORM_COMMISSION (MEMBER_ID)^
create index IDX_EIS_TECHNICAL_FORM_COMMISSION_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_COMMISSION (TECHNICAL_FORM_ID)^
-- end EIS_TECHNICAL_FORM_COMMISSION
-- begin EIS_DIVISION_INDEX
alter table EIS_DIVISION_INDEX add constraint FK_EIS_DIVISION_INDEX_ON_MASTER foreign key (MASTER_ID) references EIS_DIVISION_INDEX(ID)^
create index IDX_EIS_DIVISION_INDEX_ON_MASTER on EIS_DIVISION_INDEX (MASTER_ID)^
-- end EIS_DIVISION_INDEX
-- begin EIS_TECHNICAL_FORM_CONCLUSION
alter table EIS_TECHNICAL_FORM_CONCLUSION add constraint FK_EIS_TECHNICAL_FORM_CONCLUSION_ON_ACCOUNTABLE foreign key (ACCOUNTABLE_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_TECHNICAL_FORM_CONCLUSION add constraint FK_EIS_TECHNICAL_FORM_CONCLUSION_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
create index IDX_EIS_TECHNICAL_FORM_CONCLUSION_ON_ACCOUNTABLE on EIS_TECHNICAL_FORM_CONCLUSION (ACCOUNTABLE_ID)^
create index IDX_EIS_TECHNICAL_FORM_CONCLUSION_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_CONCLUSION (TECHNICAL_FORM_ID)^
-- end EIS_TECHNICAL_FORM_CONCLUSION
-- begin EIS_TECHNICAL_FORM_FILE_DESCRIPTOR_LINK
alter table EIS_TECHNICAL_FORM_FILE_DESCRIPTOR_LINK add constraint FK_TECFORFILDES_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
alter table EIS_TECHNICAL_FORM_FILE_DESCRIPTOR_LINK add constraint FK_TECFORFILDES_ON_FILE_DESCRIPTOR foreign key (FILE_DESCRIPTOR_ID) references SYS_FILE(ID)^
-- end EIS_TECHNICAL_FORM_FILE_DESCRIPTOR_LINK
-- begin EIS_TECHNICAL_FORM_COMPONENT
alter table EIS_TECHNICAL_FORM_COMPONENT add constraint FK_EIS_TECHNICAL_FORM_COMPONENT_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID)^
alter table EIS_TECHNICAL_FORM_COMPONENT add constraint FK_EIS_TECHNICAL_FORM_COMPONENT_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
create index IDX_EIS_TECHNICAL_FORM_COMPONENT_ON_COMPONENT on EIS_TECHNICAL_FORM_COMPONENT (COMPONENT_ID)^
create index IDX_EIS_TECHNICAL_FORM_COMPONENT_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_COMPONENT (TECHNICAL_FORM_ID)^
-- end EIS_TECHNICAL_FORM_COMPONENT
-- begin EIS_TECHNICAL_FORM_APPROVING_PERSON
alter table EIS_TECHNICAL_FORM_APPROVING_PERSON add constraint FK_EIS_TECHNICAL_FORM_APPROVING_PERSON_ON_MEMBER foreign key (MEMBER_ID) references EIS_EMPLOYEE(ID)^
alter table EIS_TECHNICAL_FORM_APPROVING_PERSON add constraint FK_EIS_TECHNICAL_FORM_APPROVING_PERSON_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
create index IDX_EIS_TECHNICAL_FORM_APPROVING_PERSON_ON_MEMBER on EIS_TECHNICAL_FORM_APPROVING_PERSON (MEMBER_ID)^
create index IDX_EIS_TECHNICAL_FORM_APPROVING_PERSON_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_APPROVING_PERSON (TECHNICAL_FORM_ID)^
-- end EIS_TECHNICAL_FORM_APPROVING_PERSON
-- begin EIS_TECHNICAL_FORM_CONCLUSION2
alter table EIS_TECHNICAL_FORM_CONCLUSION2 add constraint FK_EIS_TECHNICAL_FORM_CONCLUSION2_ON_ACCOUNTABLE foreign key (ACCOUNTABLE_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_TECHNICAL_FORM_CONCLUSION2 add constraint FK_EIS_TECHNICAL_FORM_CONCLUSION2_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
create index IDX_EIS_TECHNICAL_FORM_CONCLUSION2_ON_ACCOUNTABLE on EIS_TECHNICAL_FORM_CONCLUSION2 (ACCOUNTABLE_ID)^
create index IDX_EIS_TECHNICAL_FORM_CONCLUSION2_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_CONCLUSION2 (TECHNICAL_FORM_ID)^
-- end EIS_TECHNICAL_FORM_CONCLUSION2
-- begin EIS_TECHNICAL_FORM_COMMISSION_S2
alter table EIS_TECHNICAL_FORM_COMMISSION_S2 add constraint FK_EIS_TECHNICAL_FORM_COMMISSION_S2_ON_DIVISION foreign key (DIVISION_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_TECHNICAL_FORM_COMMISSION_S2 add constraint FK_EIS_TECHNICAL_FORM_COMMISSION_S2_ON_TECHNICAL_FORM foreign key (TECHNICAL_FORM_ID) references EIS_TECHNICAL_FORM(ID)^
create index IDX_EIS_TECHNICAL_FORM_COMMISSION_S2_ON_DIVISION on EIS_TECHNICAL_FORM_COMMISSION_S2 (DIVISION_ID)^
create index IDX_EIS_TECHNICAL_FORM_COMMISSION_S2_ON_TECHNICAL_FORM on EIS_TECHNICAL_FORM_COMMISSION_S2 (TECHNICAL_FORM_ID)^
-- end EIS_TECHNICAL_FORM_COMMISSION_S2
-- begin EIS_NTK_REMARK_ITEM
alter table EIS_NTK_REMARK_ITEM add constraint FK_EIS_NTK_REMARK_ITEM_ON_NTK_ITEM foreign key (NTK_ITEM_ID) references EIS_NTK_ITEM(ID)^
create index IDX_EIS_NTK_REMARK_ITEM_ON_NTK_ITEM on EIS_NTK_REMARK_ITEM (NTK_ITEM_ID)^
-- end EIS_NTK_REMARK_ITEM
-- begin EIS_ANALYSIS_FORM
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_DEFECT_DIVISION foreign key (DEFECT_DIVISION_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_COMPONENT foreign key (COMPONENT_ID) references EIS_NOMENCLATURE_ITEM(ID)^
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_MANUFACTURER foreign key (MANUFACTURER_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_DEVELOPER foreign key (DEVELOPER_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_FORM_CREATOR_DIVISION foreign key (FORM_CREATOR_DIVISION_ID) references EIS_DIVISION_INDEX(ID)^
alter table EIS_ANALYSIS_FORM add constraint FK_EIS_ANALYSIS_FORM_ON_PRODUCT foreign key (PRODUCT_ID) references EIS_PRODUCT(ID)^
create index IDX_EIS_ANALYSIS_FORM_ON_DEFECT_DIVISION on EIS_ANALYSIS_FORM (DEFECT_DIVISION_ID)^
create index IDX_EIS_ANALYSIS_FORM_ON_COMPONENT on EIS_ANALYSIS_FORM (COMPONENT_ID)^
create index IDX_EIS_ANALYSIS_FORM_ON_MANUFACTURER on EIS_ANALYSIS_FORM (MANUFACTURER_ID)^
create index IDX_EIS_ANALYSIS_FORM_ON_DEVELOPER on EIS_ANALYSIS_FORM (DEVELOPER_ID)^
create index IDX_EIS_ANALYSIS_FORM_ON_FORM_CREATOR_DIVISION on EIS_ANALYSIS_FORM (FORM_CREATOR_DIVISION_ID)^
create index IDX_EIS_ANALYSIS_FORM_ON_PRODUCT on EIS_ANALYSIS_FORM (PRODUCT_ID)^
-- end EIS_ANALYSIS_FORM
