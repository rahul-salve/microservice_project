package com.userService.controller;


import com.userService.entities.UserEntity;
import com.userService.service.UserService;
import com.userService.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping()
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
        UserEntity user1=userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getSingleUser(@PathVariable String userId){
        UserEntity user1=userService.getUser(userId);
        return ResponseEntity.ok(user1);
    }
    @GetMapping()
    public ResponseEntity<List<UserEntity>>  getAllUser(){
        List<UserEntity> users=userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
