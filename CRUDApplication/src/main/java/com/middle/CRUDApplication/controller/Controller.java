package com.middle.CRUDApplication.controller;

import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.usecase.UserUsecase;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;


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

    @GetMapping("/edit")
    public String edit(@RequestParam("id") String id, Model model) {
        try {
            User user = userUsecase.selectUser(id);
            UserUpdateDto userUpdateDto = new UserUpdateDto();
            userUpdateDto.setId(user.getId());
            userUpdateDto.setName(user.getName());
            userUpdateDto.setBirthday(user.getBirthday());
            userUpdateDto.setMail(user.getMail());
            model.addAttribute("UserUpdateDto",userUpdateDto);
        } catch (Exception ex) {
            model.addAttribute("errMessage", ex.getMessage());
            return "err";
        }
        return "edit";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("id")String id, @ModelAttribute UserUpdateDto userUpdateDto,Model model) {
        try {
            userUsecase.update(userUpdateDto);
            model.addAttribute("userList", userUsecase.select());

        } catch (Exception ex) {
            model.addAttribute("errMessage", ex.getMessage());
            return "err";
        }
        return  "select";
    }


    @Data
    @Getter
    @Setter
    public class UserRequestDto implements Serializable {
        private String name;
        private String birthday;
        private String email;
    }
    @Data
    @Getter
    @Setter
    public class UserUpdateDto implements Serializable {
        private  int id;
        private String mail;
        private String name;
        private Date birthday;
    }

}
