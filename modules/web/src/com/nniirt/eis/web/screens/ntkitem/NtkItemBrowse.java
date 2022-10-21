package com.nniirt.eis.web.screens.ntkitem;

import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.actions.list.CreateAction;
import com.haulmont.cuba.gui.actions.list.EditAction;
import com.haulmont.cuba.gui.actions.list.RefreshAction;
import com.haulmont.cuba.gui.actions.list.RemoveAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.data.GroupInfo;
import com.haulmont.cuba.gui.screen.*;
import com.nniirt.eis.entity.DocumentStatuses;
import com.nniirt.eis.entity.NtkItem;
import com.nniirt.eis.entity.ntk.NtkRemarkItem;
import com.nniirt.eis.service.NtkService;
import org.springframework.lang.Nullable;

import javax.inject.Inject;
import javax.inject.Named;

@UiController("eis_NtkItem.browse")
@UiDescriptor("ntk-item-browse.xml")
@LookupComponent("ntkItemsTable")
@LoadDataBeforeShow
public class NtkItemBrowse extends StandardLookup<NtkItem> {
    @Inject
    private NtkService ntkService;

    @Inject
    private Dialogs dialogs;
    @Inject
    private GroupTable<NtkItem> ntkItemsTable;

    @Named("ntkItemsTable.refresh")
    private RefreshAction ntkItemsTableRefresh;

    @Named("cloneNtk")
    private Action cloneNtk;

    @Inject
    private Security security;

    @Named("ntkItemsTable.remove")
    private RemoveAction ntkItemsTableRemove;

    @Subscribe
    public void onInit(InitEvent event) {
        cloneNtk.setVisible(security.isSpecificPermitted("app.ntk.ogt"));

        ntkItemsTable.setStyleProvider(new GroupTable.GroupStyleProvider<NtkItem>() {
            @SuppressWarnings("unchecked")
            @Override
            public String getStyleName(GroupInfo info) {
                return null;
            }
            @Override
            public String getStyleName(NtkItem item, @Nullable String property) {
                if (Boolean.TRUE.equals(item.getStatus() == DocumentStatuses.COMPLETED)) {
                    return "completed-status";
                }
                return null;
            }
        });
    }

    @Subscribe("cloneNtk")
    protected void onCloneNtkActionPerformed(Action.ActionPerformedEvent event) {
        dialogs.createOptionDialog()
                .withCaption("Пожалуйста подтвердите!")
                .withMessage("Вы действительно хотите создать копию текущего объекта?")
                .withActions(
                        new DialogAction(DialogAction.Type.YES)
                                .withHandler(e -> ntkService.DeepCloneNtkItem(ntkItemsTable.getSingleSelected()))
                                .withHandler(e -> ntkItemsTableRefresh.execute()),
                        new DialogAction(DialogAction.Type.NO)
                )
                .show();
    }

    @Subscribe("ntkItemsTable")
    protected void onNtkItemsTableSelection(Table.SelectionEvent<NtkItem> event) {
        boolean check = true;
        for(NtkItem item : event.getSelected()){

            if(item.getStatus() != null && item.getStatus() == DocumentStatuses.COMPLETED) check = false;
        }

        ntkItemsTableRemove.setEnabled(check);
    }
}