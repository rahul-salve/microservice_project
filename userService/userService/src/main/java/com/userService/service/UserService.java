package com.userService.service;

import com.userService.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    UserEntity saveUser(UserEntity user);
    List<UserEntity> getAllUsers();
    UserEntity getUser(String userId);

}
