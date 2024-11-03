
package com.study.springcore.case02.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{


    @Override
    public void addUser() {
        System.out.println("userDaoImpl:添加成功");
    }
    public UserDaoImpl() {
        System.out.println("UserDaoImpl");
    }

}
