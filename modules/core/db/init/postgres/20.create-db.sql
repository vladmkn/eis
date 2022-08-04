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
