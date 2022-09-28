-- update EIS_NTK_BOM_ITEM set COMPONENT_ID = <default_value> where COMPONENT_ID is null ;
alter table EIS_NTK_BOM_ITEM alter column COMPONENT_ID set not null ;
