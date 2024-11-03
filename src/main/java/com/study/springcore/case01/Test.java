
package com.study.springcore.case01;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

    
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setId(1001);
//        person.setName("張三");
//        System.out.println(person);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-di.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("factory-bean.xml");
        Student s = context.getBean("s1", Student.class);
        System.out.println(s);
        Student s2 = context.getBean("s2", Student.class);
        System.out.println(s2);
        Student s3 = context.getBean("s3", Student.class);
        System.out.println(s3);
        Student s4 = context.getBean("s4", Student.class);
        System.out.println(s4);
        Student s5 = context.getBean("s5", Student.class);
        System.out.println(s5);
        Student s6 = context.getBean("s6", Student.class);
        System.out.println(s6);
        Teacher t1 = context.getBean("t1", Teacher.class);
        System.out.println(t1);
        Teacher t2 = context.getBean("t2", Teacher.class);
        System.out.println(t2);
        Teacher t3 = context.getBean("t3", Teacher.class);
        System.out.println(t3);
        Teacher t4 = context.getBean("t4", Teacher.class);
        System.out.println(t4);
        Car car = ac.getBean("car", Car.class);
        System.out.println(car);
    }

}
