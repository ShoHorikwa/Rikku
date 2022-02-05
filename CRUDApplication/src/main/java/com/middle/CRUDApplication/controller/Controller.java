package com.middle.CRUDApplication.controller;

import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.port.UserPort;
import com.middle.CRUDApplication.usecase.UserUsecase;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@org.springframework.stereotype.Controller
public class Controller {
    UserUsecase userUsecase = new UserUsecase();

    @RequestMapping("/")
    public  String init(Model model) {
        model.addAttribute("modelValue", "Model Value!!");
        return "index";
    }

    @RequestMapping("/select")
    public String select(Model model) {
        List<User> userList =userUsecase.select();
        model.addAttribute("select", userList);
        return "select";

    }

//    @RequestMapping("/create")
//    public  String createUser(Model model) {
//        model.addAttribute("modelValue", "Model Value!!");
//        return "create_user";
//    }

//    @RequestMapping("/user/insert")
//    public String insert(Model model) {
//        UserUsecase userUsecase = new UserUsecase();
//        userUsecase.insert();
//        return "insert_result";
//    }

}
