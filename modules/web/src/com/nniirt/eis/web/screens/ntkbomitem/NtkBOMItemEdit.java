package com.nniirt.eis.web.screens.ntkbomitem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkBOMItem;

@UiController("eis_NtkBOMItem.edit")
@UiDescriptor("ntk-bom-item-edit.xml")
@EditedEntityContainer("ntkBOMItemDc")
@LoadDataBeforeShow
public class NtkBOMItemEdit extends StandardEditor<NtkBOMItem> {
}