package com.nniirt.eis.web.screens.jobtitle;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.catalog.JobTitle;

@UiController("eis_JobTitle.edit")
@UiDescriptor("job-title-edit.xml")
@EditedEntityContainer("jobTitleDc")
@LoadDataBeforeShow
public class JobTitleEdit extends StandardEditor<JobTitle> {
}