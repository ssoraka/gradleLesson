package com.dmdev.service;

import com.dmdev.model.User;
import com.dmdev.dao.UserDao;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
