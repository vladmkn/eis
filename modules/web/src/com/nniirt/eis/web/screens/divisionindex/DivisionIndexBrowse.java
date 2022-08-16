package com.nniirt.eis.web.screens.divisionindex;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.DivisionIndex;

@UiController("eis_DivisionIndex.browse")
@UiDescriptor("division-index-browse.xml")
@LookupComponent("divisionIndexesTable")
@LoadDataBeforeShow
public class DivisionIndexBrowse extends StandardLookup<DivisionIndex> {
}