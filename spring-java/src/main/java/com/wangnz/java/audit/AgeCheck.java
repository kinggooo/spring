package com.wangnz.java.audit;

import org.springframework.stereotype.Component;

@Component
public class AgeCheck implements AuditItemCheck {
    public int doCheck(String contractNo) {
        System.out.println("do AgeCheck");
        return 0;
    }
}
