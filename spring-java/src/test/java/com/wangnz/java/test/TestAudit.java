package com.wangnz.java.test;

import com.wangnz.java.audit.FirstAuditCheck;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/10.
 */
@SuppressWarnings("deprecation")
public class TestAudit {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-audit.xml");
        FirstAuditCheck firstAuditCheck = (FirstAuditCheck) ctx.getBean("firstAuditCheck");
        firstAuditCheck.check();
    }
}
