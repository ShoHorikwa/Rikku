package com.middle.CRUDApplication.controller;

import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.usecase.UserUsecase;
import lombok.Data;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;


@org.springframework.stereotype.Controller
public class Controller {
    UserUsecase userUsecase = new UserUsecase();

    @RequestMapping("/")
    public String init(Model model) {
        return "index";
    }

    @RequestMapping("/select")
    public String select(Model model) {
        List<User> userList = userUsecase.select();
        model.addAttribute("userList", userList);
        return "select";
    }

    @GetMapping("/insert")
    public String insertForm(Model model) {
        model.addAttribute("UserRequestDto", new UserRequestDto());
        return "form";
    }
    @PostMapping("/insert")
    public String insert(@ModelAttribute UserRequestDto userRequestDto, Model model) {
        try {
            userUsecase.insert(userRequestDto);
        } catch (Exception e) {
            model.addAttribute("errMessage", e.getMessage());
            return "err";
        }
        model.addAttribute("UserRequestDto", userRequestDto);
        return "form_result";
    }

    @RequestMapping("/detailUser")
    public String displayView(@RequestParam("id") String id, Model model) {
        try {
            model.addAttribute("user", userUsecase.selectUser(id));

        } catch(Exception e) {
            model.addAttribute("errMessage", e.getMessage());
            return "err";
        }
        return "detail_user";
    }


    @RequestMapping("/delete")
    public String delete(@RequestParam("id") String id, Model model) {
        try {
            userUsecase.delete(id);
            model.addAttribute("userList", userUsecase.select());

        } catch (Exception ex) {
            model.addAttribute("errMessage", ex.getMessage());
            return "err";
        }
        return  "select";
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
    @Data
    public class UserUpdateDto implements Serializable {
        private  List<User> userList;

        public UserUpdateDto(List<User> userList) {
            this.userList = userList.stream().collect(Collectors.toList());
        }
        public List<User> getUserList() {
            return userList;
        }



    }

}
