package com.nniirt.eis.web.screens.imbasecatalog;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.ImbaseCatalog;

@UiController("eis_ImbaseCatalog.edit")
@UiDescriptor("imbase-catalog-edit.xml")
@EditedEntityContainer("imbaseCatalogDc")
@LoadDataBeforeShow
public class ImbaseCatalogEdit extends StandardEditor<ImbaseCatalog> {
}