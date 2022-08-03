-- begin EIS_NOMENCLATURE_ITEM
alter table EIS_NOMENCLATURE_ITEM add constraint FK_EIS_NOMENCLATURE_ITEM_ON_UOM foreign key (UOM_ID) references EIS_UNIT_OF_MEASURE(ID)^
create index IDX_EIS_NOMENCLATURE_ITEM_ON_UOM on EIS_NOMENCLATURE_ITEM (UOM_ID)^
-- end EIS_NOMENCLATURE_ITEM
