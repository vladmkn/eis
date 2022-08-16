package com.nniirt.eis.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.catalog.Product;

@UiController("eis_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}