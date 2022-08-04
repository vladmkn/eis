package com.nniirt.eis.web.screens.ntkbomitem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkBOMItem;

@UiController("eis_NtkBOMItem.browse")
@UiDescriptor("ntk-bom-item-browse.xml")
@LookupComponent("ntkBOMItemsTable")
@LoadDataBeforeShow
public class NtkBOMItemBrowse extends StandardLookup<NtkBOMItem> {
}