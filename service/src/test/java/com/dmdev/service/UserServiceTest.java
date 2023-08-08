package com.dmdev.service;

import com.dmdev.dao.UserDao;
import com.dmdev.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void getAll() {
        List<User> all = userService.getAll();
        assertEquals(3, all.size());
    }
}