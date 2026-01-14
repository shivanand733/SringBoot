package com.Mr_Shivanand.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	Dev obj = (Dev)ac.getBean("dev");
    	obj.build();
    			
    }
}
