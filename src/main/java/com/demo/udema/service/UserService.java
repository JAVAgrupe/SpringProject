package com.demo.udema.service;

import com.demo.udema.entity.User;


public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
