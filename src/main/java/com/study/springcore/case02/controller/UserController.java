package com.study.springcore.case02.controller;

import com.study.springcore.case02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    public void addUser(){
     userService.addUser();
    }
    
    public UserController() {
        System.out.println("UserController");
    }
 
}
