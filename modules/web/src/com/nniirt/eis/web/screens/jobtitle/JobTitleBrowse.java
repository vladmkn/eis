package com.nniirt.eis.web.screens.jobtitle;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.catalog.JobTitle;

@UiController("eis_JobTitle.browse")
@UiDescriptor("job-title-browse.xml")
@LookupComponent("jobTitlesTable")
@LoadDataBeforeShow
public class JobTitleBrowse extends StandardLookup<JobTitle> {
}