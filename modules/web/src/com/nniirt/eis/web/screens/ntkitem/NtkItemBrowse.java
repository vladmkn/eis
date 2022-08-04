package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkItem;

@UiController("eis_NtkItem.browse")
@UiDescriptor("ntk-item-browse.xml")
@LookupComponent("ntkItemsTable")
@LoadDataBeforeShow
public class NtkItemBrowse extends StandardLookup<NtkItem> {
}