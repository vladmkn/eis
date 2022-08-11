alter table EIS_NTK_ITEM rename column quantity to quantity__u18214 ;
alter table EIS_NTK_ITEM rename column weight to weight__u86967 ;
alter table EIS_NTK_ITEM add column WEIGHT decimal(28, 8) ;
alter table EIS_NTK_ITEM add column QUANTITY decimal(28, 8) ;
