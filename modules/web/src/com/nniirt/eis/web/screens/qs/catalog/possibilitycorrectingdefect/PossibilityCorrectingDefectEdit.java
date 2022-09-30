package com.nniirt.eis.web.screens.qs.catalog.possibilitycorrectingdefect;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.PossibilityCorrectingDefect;

@UiController("eis_PossibilityCorrectingDefect.edit")
@UiDescriptor("possibility-correcting-defect-edit.xml")
@EditedEntityContainer("possibilityCorrectingDefectDc")
@LoadDataBeforeShow
public class PossibilityCorrectingDefectEdit extends StandardEditor<PossibilityCorrectingDefect> {
}