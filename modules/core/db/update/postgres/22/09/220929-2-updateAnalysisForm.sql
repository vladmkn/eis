alter table EIS_ANALYSIS_FORM add column APPENDIX text ;
alter table EIS_ANALYSIS_FORM add column MILITARY_DOCUMENT boolean ;
alter table EIS_ANALYSIS_FORM add column FORM_CREATOR_PHONE varchar(50) ;
alter table EIS_ANALYSIS_FORM add column V_DEFECT_DEFINITION text ;
alter table EIS_ANALYSIS_FORM add column V_DEFECT_CAUSE text ;
alter table EIS_ANALYSIS_FORM add column V_DEFECT_MUST_BE text ;
alter table EIS_ANALYSIS_FORM add column FORM_CREATOR varchar(300) ;
alter table EIS_ANALYSIS_FORM add column V_DEFECT_AS_IS text ;
alter table EIS_ANALYSIS_FORM add column FORM_CREATOR_DIVISION_ID uuid ;
alter table EIS_ANALYSIS_FORM add column FORM_INSTANCE_PLACE varchar(50) ;
