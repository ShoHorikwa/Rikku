package com.middle.CRUDApplication.gateway;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.driver.db.UserDriver;
import com.middle.CRUDApplication.port.UserPort;

import java.util.List;

public class UserGateway implements UserPort {
    UserDriver userDriver;

    @Override
    public void insert(UserRequestDto userRequestDto) {
         userDriver = new UserDriver();
         userDriver.insert(userRequestDto);

    }

    @Override
    public List<User> select() {
        userDriver = new UserDriver();
        return userDriver.select();
    }

}
