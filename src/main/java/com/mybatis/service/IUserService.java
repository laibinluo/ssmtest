package com.mybatis.service;

import com.mybatis.model.User;

public interface IUserService {
    User selectUser(long userId);
}
