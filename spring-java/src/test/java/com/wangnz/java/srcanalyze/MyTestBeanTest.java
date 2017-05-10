package com.wangnz.java.srcanalyze;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017/5/10.
 */
@SuppressWarnings("deprecation")
public class MyTestBeanTest {
    @Test
    public void test1() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-srcanalyze.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println(bean.getTestStr());
    }
}
