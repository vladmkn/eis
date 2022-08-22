package com.nniirt.eis.web.screens.technicalform;

import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;
import com.haulmont.reports.gui.actions.EditorPrintFormAction;
import com.haulmont.reports.gui.actions.list.ListPrintFormAction;
import com.haulmont.reports.gui.actions.list.RunReportAction;
import com.nniirt.eis.entity.qs.TechnicalForm;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@UiController("eis_TechnicalForm.edit")
@UiDescriptor("technical-form-edit.xml")
@EditedEntityContainer("technicalFormDc")
@LoadDataBeforeShow
public class TechnicalFormEdit extends StandardEditor<TechnicalForm> {

    @Inject
    protected FileUploadField upload;

    @Inject
    protected FileUploadingAPI fileUploadingAPI;

    @Inject
    protected Notifications notifications;

    @Inject
    protected ExportDisplay exportDisplay;
    @Inject
    protected CollectionPropertyContainer<FileDescriptor> filesDc;
    @Inject
    protected Logger logger;
    @Inject
    protected Table<FileDescriptor> filesTable;
    @Inject
    protected MessageBundle messageBundle;
    @Inject
    protected BrowserFrame browserFrame;
    @Inject
    protected Button printBtn;
    @Inject
    private DataManager dataManager;
    @Inject
    private FileStorageService fileStorageService;
    private List<FileDescriptor> newImageDescriptors = new ArrayList<>();

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
        printBtn.setAction(new EditorPrintFormAction(this, null));
    }

    @Subscribe
    protected void onAfterShow(AfterShowEvent event) {
        TechnicalForm thForm = getEditedEntity();

        try {
            browserFrame.setSource(UrlResource.class).setUrl(
                    new URL("http://rtvm-test15.nniirt.local:5000/?reportName=act&reportId=" + thForm.getId().toString()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}