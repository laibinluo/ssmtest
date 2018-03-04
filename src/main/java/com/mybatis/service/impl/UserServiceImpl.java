package com.mybatis.service.impl;

import com.mybatis.dao.IUserDao;
import com.mybatis.model.User;
import com.mybatis.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
