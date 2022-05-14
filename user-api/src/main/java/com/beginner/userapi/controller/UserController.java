package com.beginner.userapi.controller;

import com.beginner.userapi.domain.User;
import com.beginner.userapi.usecase.UserUsecase;
import com.google.gson.Gson;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    @Autowired
    UserUsecase userUsecase;

    @GetMapping("/ping")
    public String test() {
        Gson gson = new Gson();
        return gson.toJson("pong");
    }

    @GetMapping("/user/select")
    public String selectAll() {
        List<ResponseDto> responseDtoList = userUsecase.selectAll().stream().map(it -> toResponseDto(it)).collect(Collectors.toUnmodifiableList());
        return new Gson().toJson(responseDtoList);
    }

    private ResponseDto toResponseDto(User user) {
       ResponseDto responseDto = new ResponseDto();
       responseDto.setId(user.getId());
       responseDto.setName(user.getName());
       return  responseDto;
    }

    @Data
    private class ResponseDto {
        private String id;
        private String name;
    }
}
