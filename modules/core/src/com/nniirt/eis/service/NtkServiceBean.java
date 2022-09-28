package com.nniirt.eis.service;

import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Security;
import com.nniirt.eis.entity.NtkBOMItem;
import com.nniirt.eis.entity.NtkItem;
import com.nniirt.eis.entity.ntk.NtkRemarkItem;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service(NtkService.NAME)
public class NtkServiceBean implements NtkService {
    @Inject
    private DataManager dataManager;

    @Inject
    private Security security;

    @Override
    public NtkItem DeepCloneNtkItem(NtkItem item) {
        CommitContext commitContext = new CommitContext();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        NtkItem newItem = dataManager.create(NtkItem.class);
        newItem.setBlueprint(item.getBlueprint());
        newItem.setComponent(item.getComponent());
        newItem.setName(item.getName() + " (Копия от " + java.time.LocalDateTime.now().format(formatter) + ")");
        newItem.setGeometry(item.getGeometry());
        newItem.setMaterialRoute(item.getMaterialRoute());
        newItem.setMaterialSize(item.getMaterialSize());
        newItem.setNtkVersion(item.getNtkVersion());
        newItem.setProductId(item.getProductId());
        newItem.setQuantity(item.getQuantity());
        newItem.setRoute(item.getRoute());
        newItem.setWeight(item.getWeight());

        commitContext.addInstanceToCommit(newItem);

        for(NtkBOMItem it: item.getComponents()){
            NtkBOMItem nit = new NtkBOMItem();
            nit.setComponent(it.getComponent());
            nit.setKzap(it.getKzap());
            nit.setQuantity(it.getQuantity());
            nit.setRatio(it.getRatio());
            nit.setRemark(it.getRemark());
            nit.setRoute(it.getRoute());
            nit.setSaktiv(it.getSaktiv());
            nit.setSdrag(it.getSdrag());
            nit.setShim(it.getShim());
            nit.setSlkm(it.getSlkm());
            nit.setSmet(it.getSmet());
            nit.setNtkItem(newItem);

            nit.setBmn(false);
            nit.setHts(false);
            nit.setOgt(true);
            nit.setOme(false);

            commitContext.addInstanceToCommit(nit);
        }

        for(NtkRemarkItem it: item.getRemarks()) {
            NtkRemarkItem nit = new NtkRemarkItem();
            nit.setText(it.getText());
            nit.setBmn(false);
            nit.setHts(false);
            nit.setOgt(true);
            nit.setOme(false);

            nit.setNtkItem(newItem);

            commitContext.addInstanceToCommit(nit);
        }

        dataManager.commit(commitContext);

        return newItem;
    }
}