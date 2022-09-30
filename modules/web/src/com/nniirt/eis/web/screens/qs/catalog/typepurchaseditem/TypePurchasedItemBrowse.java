package com.nniirt.eis.web.screens.qs.catalog.typepurchaseditem;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.qs.catalog.TypePurchasedItem;

@UiController("eis_TypePurchasedItem.browse")
@UiDescriptor("type-purchased-item-browse.xml")
@LookupComponent("typePurchasedItemsTable")
@LoadDataBeforeShow
public class TypePurchasedItemBrowse extends StandardLookup<TypePurchasedItem> {
}