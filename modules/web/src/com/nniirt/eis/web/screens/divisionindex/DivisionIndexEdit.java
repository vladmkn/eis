package com.nniirt.eis.web.screens.divisionindex;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.DivisionIndex;

@UiController("eis_DivisionIndex.edit")
@UiDescriptor("division-index-edit.xml")
@EditedEntityContainer("divisionIndexDc")
@LoadDataBeforeShow
public class DivisionIndexEdit extends StandardEditor<DivisionIndex> {
}