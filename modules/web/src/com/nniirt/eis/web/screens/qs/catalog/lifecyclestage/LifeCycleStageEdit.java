package com.nniirt.eis.web.screens.qs.catalog.lifecyclestage;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.LifeCycleStage;

@UiController("eis_LifeCycleStage.edit")
@UiDescriptor("life-cycle-stage-edit.xml")
@EditedEntityContainer("lifeCycleStageDc")
@LoadDataBeforeShow
public class LifeCycleStageEdit extends StandardEditor<LifeCycleStage> {
}