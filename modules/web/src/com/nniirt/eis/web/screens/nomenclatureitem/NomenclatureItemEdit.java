package com.nniirt.eis.web.screens.nomenclatureitem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NomenclatureItem;

@UiController("eis_NomenclatureItem.edit")
@UiDescriptor("nomenclature-item-edit.xml")
@EditedEntityContainer("nomenclatureItemDc")
@LoadDataBeforeShow
public class NomenclatureItemEdit extends StandardEditor<NomenclatureItem> {
}