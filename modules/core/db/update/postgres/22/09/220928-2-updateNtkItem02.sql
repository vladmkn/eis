update EIS_NTK_ITEM set BLUEPRINT = '' where BLUEPRINT is null ;
alter table EIS_NTK_ITEM alter column BLUEPRINT set not null ;
update EIS_NTK_ITEM set NAME = '' where NAME is null ;
alter table EIS_NTK_ITEM alter column NAME set not null ;
