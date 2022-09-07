package com.nniirt.eis.entity.qs;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "EIS_DIVISION_INDEX")
@Entity(name = "eis_DivisionIndex")
@NamePattern("%s|nickname")
public class DivisionIndex extends StandardEntity {
    private static final long serialVersionUID = -6533640834500731829L;

    @Column(name = "NAME", length = 455)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MASTER_ID")
    private DivisionIndex master;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "INDEX_", length = 100)
    private String index;

    public DivisionIndex getMaster() {
        return master;
    }

    public void setMaster(DivisionIndex master) {
        this.master = master;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}