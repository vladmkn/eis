package com.nniirt.eis.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.catalog.Product;

@UiController("eis_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}