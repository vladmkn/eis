package com.nniirt.eis.web.screens.qs.catalog.lifecyclestage;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.LifeCycleStage;

@UiController("eis_LifeCycleStage.browse")
@UiDescriptor("life-cycle-stage-browse.xml")
@LookupComponent("lifeCycleStagesTable")
@LoadDataBeforeShow
public class LifeCycleStageBrowse extends StandardLookup<LifeCycleStage> {
}