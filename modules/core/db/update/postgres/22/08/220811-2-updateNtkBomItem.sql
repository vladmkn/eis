alter table EIS_NTK_BOM_ITEM rename column ratio to ratio__u34605 ;
alter table EIS_NTK_BOM_ITEM rename column kzap to kzap__u38532 ;
alter table EIS_NTK_BOM_ITEM rename column shim to shim__u56574 ;
alter table EIS_NTK_BOM_ITEM rename column saktiv to saktiv__u60415 ;
alter table EIS_NTK_BOM_ITEM rename column smet to smet__u25727 ;
alter table EIS_NTK_BOM_ITEM rename column sdrag to sdrag__u93560 ;
alter table EIS_NTK_BOM_ITEM rename column slkm to slkm__u83135 ;
alter table EIS_NTK_BOM_ITEM rename column quantity to quantity__u91204 ;
alter table EIS_NTK_BOM_ITEM add column QUANTITY decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column SLKM decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column SDRAG decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column SMET decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column SAKTIV decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column SHIM decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column KZAP decimal(28, 8) ;
alter table EIS_NTK_BOM_ITEM add column RATIO decimal(28, 8) ;