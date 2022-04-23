package com.middle.CRUDApplication.port;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
import com.middle.CRUDApplication.controller.Controller.UserUpdateDto;
import com.middle.CRUDApplication.domein.User;

import java.util.List;

public interface UserPort {
    void insert(User insertUser) throws Exception;
    List<User> select();
    User selectUser(String id) throws  Exception;
    void delete(String id) throws  Exception;
    void update(User userUpdateDto) throws Exception;
}
