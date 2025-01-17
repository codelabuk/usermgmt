package com.codelabuk.usermgmt.service;

import com.codelabuk.usermgmt.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUser(String id);

    void addUser(User user);

    User updateUser(User user);

    User deleteUser(String id);
}
