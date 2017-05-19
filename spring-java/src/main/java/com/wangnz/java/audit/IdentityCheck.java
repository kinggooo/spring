package com.wangnz.java.audit;

import org.springframework.stereotype.Component;

@Component
public class IdentityCheck implements AuditItemCheck {
    public int doCheck(String contractNo) {
        System.out.println("do IdentityCheck");
        return 0;
    }
}
