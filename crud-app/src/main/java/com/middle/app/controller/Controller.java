package com.middle.app.controller;

import com.middle.app.domein.User;
import com.middle.app.usecase.UserUsecase;
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

    enum MESSAGE {
        INSERT_SUCCESS("登録に成功しました!!"),
        DELETE_SUCCESS("削除に成功しました!!"),
        UPDATE_SUCCESS("更新に成功しました!!"),
        ;
        String message;

        MESSAGE(String message) {
            this.message = message;
        }
        public String getMessage() {
            return this.message;
        }
    }

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
        model.addAttribute("message", MESSAGE.INSERT_SUCCESS.getMessage());
        return "form";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute UserRequestDto userRequestDto, Model model) {
        try {
            userUsecase.insert(userRequestDto);
            model.addAttribute("UserRequestDto", userRequestDto);
            model.addAttribute("message", MESSAGE.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            model.addAttribute("errMessage", e.getMessage());
            return "err";
        }

        return "form_result";
    }

    @RequestMapping("/detailUser")
    public String displayView(@RequestParam("id") String id, Model model) {
        try {
            model.addAttribute("user", userUsecase.selectUser(id));

        } catch (Exception e) {
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
            model.addAttribute("message", MESSAGE.DELETE_SUCCESS.getMessage());

        } catch (Exception ex) {
            model.addAttribute("errMessage", ex.getMessage());
            return "err";
        }
        return "select";
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
            userUpdateDto.setAddress(user.getAddress());
            userUpdateDto.setTelephone(user.getTelephone());
            model.addAttribute("UserUpdateDto", userUpdateDto);
        } catch (Exception ex) {
            model.addAttribute("errMessage", ex.getMessage());
            return "err";
        }
        return "edit";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("id") String id, @ModelAttribute UserUpdateDto userUpdateDto, Model model) {
        try {
            userUsecase.update(userUpdateDto);
            model.addAttribute("userList", userUsecase.select());
            model.addAttribute("message", MESSAGE.UPDATE_SUCCESS.getMessage());

        } catch (Exception ex) {
            model.addAttribute("errMessage", ex.getMessage());
            return "err";
        }
        return "select";
    }


    @Data
    @Getter
    @Setter
    public class UserRequestDto implements Serializable {
        private String name;
        private String birthday;
        private String email;
        private String address;
        private String telephone;
    }

    @Data
    @Getter
    @Setter
    public class UserUpdateDto implements Serializable {
        private String id;
        private String mail;
        private String name;
        private Date birthday;
        private String address;
        private String telephone;
    }



}
