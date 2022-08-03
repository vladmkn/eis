package com.nniirt.eis.web.screens.nomenclatureitem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.NomenclatureItem;

@UiController("eis_NomenclatureItem.browse")
@UiDescriptor("nomenclature-item-browse.xml")
@LookupComponent("nomenclatureItemsTable")
@LoadDataBeforeShow
public class NomenclatureItemBrowse extends StandardLookup<NomenclatureItem> {
}