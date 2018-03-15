package com.spring.test2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Config.SpringConfig;
import service.TestBean;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        String name = bean.getName();
        System.out.println(name); 
    }
}
