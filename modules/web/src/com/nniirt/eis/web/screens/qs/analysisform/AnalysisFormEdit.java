package com.nniirt.eis.web.screens.qs.analysisform;

import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;
import com.haulmont.reports.gui.actions.EditorPrintFormAction;
import com.nniirt.eis.entity.qs.AnalysisForm;
import com.nniirt.eis.entity.qs.AnalysisFormConclusion;
import com.nniirt.eis.entity.qs.catalog.DefectNature;
import com.nniirt.eis.entity.qs.catalog.TypePurchasedItem;
import org.slf4j.Logger;

import javax.annotation.Nullable;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("eis_AnalysisForm.edit")
@UiDescriptor("analysis-form-edit.xml")
@EditedEntityContainer("analysisFormDc")
@LoadDataBeforeShow
public class AnalysisFormEdit extends StandardEditor<AnalysisForm> {
    @Inject
    private DataManager dataManager;
    @Inject
    protected FileUploadField upload;
    @Inject
    protected FileUploadingAPI fileUploadingAPI;
    @Inject
    private FileStorageService fileStorageService;
    private List<FileDescriptor> newImageDescriptors = new ArrayList<>();
    @Inject
    protected Table<FileDescriptor> filesTable;
    @Inject
    protected ExportDisplay exportDisplay;
    @Inject
    protected Notifications notifications;
    @Inject
    protected CollectionPropertyContainer<FileDescriptor> filesDc;
    @Inject
    protected MessageBundle messageBundle;
    @Inject
    protected Logger logger;
    @Inject
    protected LookupPickerField defectNatureField;
    @Inject
    protected LookupPickerField typePurchasedItemField;
    @Inject
    protected Label typePurchasedItemLabel;

    @Inject
    protected CheckBox externalDocumentField;

    @Inject
    protected Table conclusionTable;
    @Inject
    protected Button printBtn;

    @Subscribe("filesTable.download")
    protected void onFilesTableDownload(Action.ActionPerformedEvent event) {
        downloadFile(filesTable.getSingleSelected());
    }

    private void downloadFile(FileDescriptor file) {
        exportDisplay.show(file, ExportFormat.OCTET_STREAM);
    }

    @Subscribe("upload")
    protected void onUploadFileUploadSucceed(FileUploadField.FileUploadSucceedEvent event) {
        FileDescriptor imageDescriptor = upload.getFileDescriptor();

        try {
            fileUploadingAPI.putFileIntoStorage(upload.getFileId(), imageDescriptor);
            // save file descriptor and remember it in case the user clicks "Cancel" and we need to remove it
            FileDescriptor savedImageDescriptor = dataManager.commit(imageDescriptor);
            newImageDescriptors.add(savedImageDescriptor);
            // add file descriptor to data container to show in the table
            filesDc.getMutableItems().add(savedImageDescriptor);

            notifications.create(Notifications.NotificationType.TRAY)
                    .withCaption(messageBundle.getMessage("fileStoredSuccessfully")).show();
        } catch (FileStorageException e) {
            String failedMessage = messageBundle.getMessage("fileStorageFailed");
            notifications.create(Notifications.NotificationType.ERROR).withCaption(failedMessage).show();

            logger.error(failedMessage, e);
        }
    }

    @Subscribe
    public void onInit(InitEvent event) {

        switchDefectNature(false);

        defectNatureField.addValueChangeListener(valueChangeEvent -> {
                Boolean flag = false;

                Object obj = ((HasValue.ValueChangeEvent) valueChangeEvent).getValue();

                if(obj != null) {
                    DefectNature val = (DefectNature) obj;
                    flag = val.getDefinition().equals("Дефект КИ (покупного)");
                }else flag = false;

                switchDefectNature(flag);
            });

        externalDocumentField.addValueChangeListener(valueChangeEvent -> switchExternalDocument(valueChangeEvent.getValue()));

        printBtn.setAction(new EditorPrintFormAction(this, null));
    }

    private void switchExternalDocument(Boolean externalDocument)
    {
        boolean extDoc = Boolean.TRUE.equals(externalDocument);

        conclusionTable.getColumn("recipient").setCollapsed(!extDoc);
        conclusionTable.getColumn("address").setCollapsed(!extDoc);
        conclusionTable.getColumn("fax").setCollapsed(!extDoc);
        conclusionTable.getColumn("phone").setCollapsed(!extDoc);

//        if(extDoc) {
//            conclusionTable.addGeneratedColumn("recipient", new Table.ColumnGenerator<AnalysisFormConclusion>() {
//                @Override
//                public Component generateCell(AnalysisFormConclusion entity) {
//                    Label field = (Label) componentsFactory.createComponent(Label.NAME);
//                    field.setValue(declaration.getValue());
//                    return field;
//                }
//            });
//        }else {
//            conclusionTable.removeColumn(conclusionTable.getColumn("recipient"));
//            conclusionTable.removeColumn(conclusionTable.getColumn("address"));
//            conclusionTable.removeColumn(conclusionTable.getColumn("fax"));
//            conclusionTable.removeColumn(conclusionTable.getColumn("phone"));
//        }
    }

    private void switchDefectNature(Boolean flag)
    {
        typePurchasedItemField.setVisible(flag);
        typePurchasedItemLabel.setVisible(flag);
    }

}