package com.example.usertest.service;

import com.example.usertest.pojo.User;

import java.util.List;

/**
 * @description:
 **/

public interface UserService {

    void insert(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> listUsersByIds(List<Long> ids);

}
