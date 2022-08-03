package com.nniirt.eis.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum InformationSources implements EnumClass<Integer> {

    GALAKTIKA(10),
    PDM(20),
    ARM(30),
    MDM(40),
    EIS(50);

    private Integer id;

    InformationSources(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static InformationSources fromId(Integer id) {
        for (InformationSources at : InformationSources.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}