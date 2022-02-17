package com.middle.CRUDApplication.gateway;


import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
import com.middle.CRUDApplication.controller.Controller.UserUpdateDto;
import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.driver.db.UserDriver;
import com.middle.CRUDApplication.port.UserPort;

import java.util.List;

public class UserGateway implements UserPort {
    UserDriver userDriver;

    @Override
    public void insert(UserRequestDto userRequestDto) throws Exception {
         userDriver = new UserDriver();
         userDriver.insert(userRequestDto);

    }

    @Override
    public List<User> select() {
        userDriver = new UserDriver();
        return userDriver.select();
    }

    @Override
    public User selectUser(String id) throws  Exception{
        userDriver = new UserDriver();
        return  userDriver.selectUser(id);
    }

    @Override
    public void delete(String id) throws  Exception {
        userDriver = new UserDriver();
        userDriver.delete(id);
    }

    @Override
    public void update(UserUpdateDto userUpdateDto) throws  Exception{
        userDriver = new UserDriver();
        userDriver.update(userUpdateDto);

    }
}
