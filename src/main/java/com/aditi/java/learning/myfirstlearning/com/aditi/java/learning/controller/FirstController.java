package com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.controller;

import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.entity.User;
import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.services.FirstService;
import com.aditi.java.learning.myfirstlearning.com.aditi.java.learning.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FirstController {

    @Autowired private FirstService firstService;

    @Autowired private UserService userService;

    @GetMapping(path = "sum")
    public Integer sum(
            @RequestParam(value = "int1") Integer firstInt,
            @RequestParam(value = "int2") Integer secondInt
    ){
        log.info("Request came to sum {} and {}", firstInt, secondInt);
        Integer result = firstService.sum(firstInt, secondInt);
        log.info("result is {}", result);
        return result;
    }


    @GetMapping(path = "user")
    public User getDetails(
            @RequestParam(value = "userId") Long userId
    ){
        return userService.getUserDetails(userId);
    }



}
