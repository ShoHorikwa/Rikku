package com.middle.CRUDApplication.usecase;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
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

    public void insert(UserRequestDto userRequestDto) {
        userPort = new UserGateway();
        userPort.insert(userRequestDto);

    }
}
