package com.wangnz.java.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/10.
 */
@SuppressWarnings("deprecation")
public class TestQuartz {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-quartz.xml");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
