package com.study.springcore.case03.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        MathI mathI = context.getBean("mathImpl", MathI.class);
        //System.out.println(mathI.div(3, 1));
        
        TestHandler bean = context.getBean("testHandler", TestHandler.class);
        bean.test();

    }

}
