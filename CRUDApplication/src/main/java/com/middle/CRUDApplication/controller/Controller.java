package com.middle.CRUDApplication.controller;

import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.usecase.UserUsecase;
import lombok.Data;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
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
        model.addAttribute("userList", userList);
        return "select";
    }

     @GetMapping("/insert")
    public  String form(Model model) {
        model.addAttribute("UserRequestDto",new UserRequestDto());
        return  "form";
     }
     @PostMapping("insert")
     public String insert(@ModelAttribute UserRequestDto userRequestDto, Model model) {
        model.addAttribute("UserRequestDto", userRequestDto);
        userUsecase.insert(userRequestDto);

        return  "form_result";
     }

     @Data
     public class UserRequestDto implements Serializable {

        private String name;
        private String birthday;
        private String email;


         public String getName() {
             return name;
         }

         public String getBirthday() {
             return birthday;
         }

         public String getEmail() {
             return email;
         }
     }

}
