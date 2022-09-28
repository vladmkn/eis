update EIS_NTK_REMARK_ITEM set TEXT = '' where TEXT is null ;
alter table EIS_NTK_REMARK_ITEM alter column TEXT set not null ;
