
package com.study.springcore.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
