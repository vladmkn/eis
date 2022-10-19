-- alter table EIS_ANALYSIS_FORM_CONCLUSION add column ANALYSIS_FORM_ID uuid ^
-- update EIS_ANALYSIS_FORM_CONCLUSION set ANALYSIS_FORM_ID = <default_value> ;
-- alter table EIS_ANALYSIS_FORM_CONCLUSION alter column ANALYSIS_FORM_ID set not null ;
alter table EIS_ANALYSIS_FORM_CONCLUSION add column ANALYSIS_FORM_ID uuid not null ;
