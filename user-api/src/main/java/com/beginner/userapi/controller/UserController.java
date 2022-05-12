package com.beginner.userapi.controller;

import com.beginner.userapi.usecase.UserUsecase;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserUsecase userUsecase;

    @GetMapping("/ping")
    public String test() {
        Gson gson = new Gson();
        return gson.toJson("pong");
    }
}
