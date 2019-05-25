package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
     System.out.println("bean intialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroyed");

    }
    public void customInit(){
        System.out.println("custom bean initialized");
    }
    public void customDestroy(){
        System.out.println("custom bean destroyed");
    }
}
