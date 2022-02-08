package com.middle.CRUDApplication.port;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
import com.middle.CRUDApplication.domein.User;

import java.util.List;

public interface UserPort {
    void insert(UserRequestDto userRequestDto);
    List<User> select();
}
