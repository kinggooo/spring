package com.wangnz.java.audit;

import java.util.ArrayList;
import java.util.List;

public class FirstAuditCheck {
    private List<AuditItemCheck> checkItem = new ArrayList<AuditItemCheck>();

    public List<AuditItemCheck> getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(List<AuditItemCheck> checkItem) {
        this.checkItem = checkItem;
    }

    public void check() {
        for (AuditItemCheck item : checkItem) {
            item.doCheck("123");
        }
    }
}
