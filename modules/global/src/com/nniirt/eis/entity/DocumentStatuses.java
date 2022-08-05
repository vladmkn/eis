package com.nniirt.eis.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DocumentStatuses implements EnumClass<Integer> {

    DRAFT(10),
    COMPLETED(20),
    VEFRIFIED(30),
    SIGNED(40),
    CANCELLED(50);

    private Integer id;

    DocumentStatuses(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static DocumentStatuses fromId(Integer id) {
        for (DocumentStatuses at : DocumentStatuses.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}