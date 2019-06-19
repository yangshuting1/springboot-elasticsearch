package com.yst.springbootelasticsearch.controller;

import com.yst.springbootelasticsearch.entity.User;
import com.yst.springbootelasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userReposiory;


    @RequestMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userReposiory.save(user);
    }
}
