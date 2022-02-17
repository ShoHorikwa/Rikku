package com.middle.CRUDApplication.usecase;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
import com.middle.CRUDApplication.controller.Controller.UserUpdateDto;
import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.gateway.UserGateway;
import com.middle.CRUDApplication.port.UserPort;

import java.util.List;

public class UserUsecase {

    UserPort userPort;

    public List<User> select() {
        userPort = new UserGateway();
        return  userPort.select();
    }

    public void insert(UserRequestDto userRequestDto) throws Exception {
        userPort = new UserGateway();
        userPort.insert(userRequestDto);
    }

    public User selectUser(String id) throws  Exception {
        userPort = new UserGateway();
        return  userPort.selectUser(id);
    }

    public void delete(String id) throws  Exception {
        userPort = new UserGateway();
        userPort.delete(id);
    }

    public void update(UserUpdateDto userUpdateDto) throws Exception {
        userPort = new UserGateway();
        userPort.update(userUpdateDto);
    }
}
