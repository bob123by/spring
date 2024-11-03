
package com.study.springcore.case02;

import com.study.springcore.case02.controller.UserController;
import com.study.springcore.case02.dao.UserDao;
import com.study.springcore.case02.dao.UserDaoImpl;
import com.study.springcore.case02.service.UserService;
import com.study.springcore.case02.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        UserController uc = context.getBean("userController", UserController.class);
        System.out.println(uc);
        UserService us = context.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(us);
        UserDao ud = context.getBean("userDaoImpl", UserDaoImpl.class);
        System.out.println(ud);
        uc.addUser();
    }
}
