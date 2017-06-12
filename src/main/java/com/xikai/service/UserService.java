package com.xikai.service;

import com.xikai.model.User;

/**
 * Created by xikaixiong on 6/11/17.
 */
public interface UserService {
    public User findUserByEmail(String email);

    public void saveUser(User user);
}
