package com.stackroute.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public void createBeanPostProcessor(){
        System.out.println("bean post processor created");
    }
}
