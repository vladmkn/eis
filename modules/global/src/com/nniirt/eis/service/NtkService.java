package com.nniirt.eis.service;

import com.nniirt.eis.entity.NtkItem;

import javax.mail.Session;

public interface NtkService {
    String NAME = "eis_NtkService";

    NtkItem DeepCloneNtkItem(NtkItem item);
}