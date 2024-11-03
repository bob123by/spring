
package com.study.springcore.case02.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMyBatis implements UserDao{

    @Override
    public void addUser() {
        System.out.println("UserDaoMyBatis: 添加成功");
    }

}
