package com.wangnz.java.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("job2")
public class Job2 {
    @Autowired
    private AnotherBean anotherBean;

    public void doJob2() {
        System.out.println("不继承QuartzJobBean方式-调度进行中...");
        anotherBean.printAnotherMessage();
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
