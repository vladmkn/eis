package com.nniirt.eis.service;

import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.nniirt.eis.entity.NtkItem;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(NtkService.NAME)
public class NtkServiceBean implements NtkService {
    @Inject
    private DataManager dataManager;

    @Override
    public NtkItem DeepCloneNtkItem(NtkItem item) {
        NtkItem newItem = dataManager.create(NtkItem.class);
        newItem.setBlueprint(item.getBlueprint());
        newItem.setComponent(item.getComponent());
        newItem.setName(item.getName());

        CommitContext commitContext = new CommitContext();
        commitContext.addInstanceToCommit(newItem);

        dataManager.commit(commitContext);

        return newItem;
    }
}