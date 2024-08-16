package com.project.JobPortal.services;

import com.project.JobPortal.entities.User;

import java.util.Set;

public interface UserServices {

    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    Set<User> getAllUsers();
}
