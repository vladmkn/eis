package com.nniirt.eis.service;

import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.nniirt.eis.entity.*;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@Service(NomenclatureService.NAME)
public class NomenclatureServiceBean implements NomenclatureService {
    @Inject
    private DataManager dataManager;

    @Override
    public void ReloadFromARM() {
        List<UnitOfMeasurePDM> listPDM = dataManager.load(UnitOfMeasurePDM.class)
                .query("select e from eis_UnitOfMeasurePDM e where e.loadTs is null " +
                        "and e.deleteTs is null").list();

        for (UnitOfMeasurePDM itemPDM: listPDM) {
            CommitContext commitContext = new CommitContext();

            UnitOfMeasure newItem = dataManager.create(UnitOfMeasure.class);
            newItem.setNickname(itemPDM.getNickname());
            newItem.setFullname(itemPDM.getFullname());
            newItem.setIdgal(itemPDM.getIdgal());
            newItem.setInformationSource(itemPDM.getInformationSource());
            itemPDM.setLoadTs(new Date());

            commitContext.addInstanceToCommit(itemPDM);
            commitContext.addInstanceToCommit(newItem);

            dataManager.commit(commitContext);
        }

        List<UnitOfMeasure> listUOM = dataManager.load(UnitOfMeasure.class)
                .query("select e from eis_UnitOfMeasure e where e.deleteTs is null").list();

        boolean loopFlag = true;

        while(loopFlag) {

            List<NomenclatureItemPDM> listNPDM =
                    dataManager.load(NomenclatureItemPDM.class)
                            .view("nomenclatureitem-with-uom")
                            .query("select e from eis_NomenclatureItemPDM e where e.loadTs is null " +
                                    "and e.deleteTs is null")
                            .maxResults(1000)
                            .list();

            loopFlag = false;

            CommitContext commitContext = new CommitContext();

            for (NomenclatureItemPDM itemNPDM : listNPDM) {

                NomenclatureItem newItem = dataManager.create(NomenclatureItem.class);
                newItem.setName(itemNPDM.getName());
                newItem.setBlueprintname(itemNPDM.getBlueprintname());
                newItem.setDisplayname(itemNPDM.getDisplayname());
                newItem.setIdgal(itemNPDM.getIdgal());
                newItem.setIdarm(itemNPDM.getIdarm());
                if (itemNPDM.getUom() != null)
                    newItem.setUom(listUOM.stream().filter(e -> itemNPDM.getUom().getIdgal().equals(e.getIdgal())).findAny().orElse(null));
                newItem.setIsUsed(itemNPDM.getIsUsed());
                newItem.setInformationSource(itemNPDM.getInformationSource());
                itemNPDM.setLoadTs(new Date());

                commitContext.addInstanceToCommit(itemNPDM);
                commitContext.addInstanceToCommit(newItem);

                loopFlag = true;
            }

            dataManager.commit(commitContext);

        }

    }
}