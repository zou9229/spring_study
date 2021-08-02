package com.zou.service;

import com.zou.dao.UserDao;
import com.zou.dao.UserDaoImpl;
import com.zou.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){

        userDao.getUser();
    }

}
