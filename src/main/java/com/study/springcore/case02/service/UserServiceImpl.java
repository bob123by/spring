package com.study.springcore.case02.service;

import com.alibaba.druid.filter.AutoLoad;
import com.study.springcore.case02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    @Qualifier(value = "userDaoMyBatis")

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.addUser();
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl");
    }
}
