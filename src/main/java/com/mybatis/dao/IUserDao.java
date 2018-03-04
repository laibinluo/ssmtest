package com.mybatis.dao;

import com.mybatis.model.User;

public interface IUserDao {
    User selectUser (long id);
}
