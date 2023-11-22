package com.boxing.boxingclub.service;

import com.boxing.boxingclub.entity.User;
import com.boxing.boxingclub.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * {@code @service} annotations  is used to indicate that a class is a service component.
 * {@code @service} Service in Spring are typically to encapsulate business logic, and they act as a middel layer
 * between the controller( which handle HTTP request)and repository (which is interacted with database).
 */

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Page<User> getAllUser(Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        return users;

    }

}
