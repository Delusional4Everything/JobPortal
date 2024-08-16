package com.project.JobPortal.services.Impl;

import com.project.JobPortal.entities.User;
import com.project.JobPortal.repositories.UserRepository;
import com.project.JobPortal.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserServices {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Set<User> getAllUsers() {
        return new HashSet<>(userRepository.findAll());
    }
}
