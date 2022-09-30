package com.nniirt.eis.web.screens.qs.catalog.typepurchaseditem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.TypePurchasedItem;

@UiController("eis_TypePurchasedItem.edit")
@UiDescriptor("type-purchased-item-edit.xml")
@EditedEntityContainer("typePurchasedItemDc")
@LoadDataBeforeShow
public class TypePurchasedItemEdit extends StandardEditor<TypePurchasedItem> {
}