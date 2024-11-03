package com.study.springcore.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Person p = (Person) context.getBean("person");
        //Person p = context.getBean(Person.class);
//        Person p = context.getBean("personTwo",Person.class);
//        System.out.println(p);
//        Person p = context.getBean("personThree",Person.class);
//        System.out.println(p);
        Person p = context.getBean("personFour",Person.class);
        System.out.println(p);
    }
}
