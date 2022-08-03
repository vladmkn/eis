package com.nniirt.eis.web.screens.imbasecatalog;

import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.ImbaseCatalog;

@UiController("eis_ImbaseCatalog.browse")
@UiDescriptor("imbase-catalog-browse.xml")
@LookupComponent("imbaseCatalogsTable")
@LoadDataBeforeShow
public class ImbaseCatalogBrowse extends StandardLookup<ImbaseCatalog> {
}