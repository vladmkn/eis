package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NtkItem;

@UiController("eis_NtkItem.edit")
@UiDescriptor("ntk-item-edit.xml")
@EditedEntityContainer("ntkItemDc")
@LoadDataBeforeShow
public class NtkItemEdit extends StandardEditor<NtkItem> {
}