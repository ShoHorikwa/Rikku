package com.middle.CRUDApplication.gateway;

import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.driver.db.UserDriver;
import com.middle.CRUDApplication.port.UserPort;

import java.util.List;

public class UserGateway implements UserPort {
    @Override
    public void insert() {
        UserDriver userDriver = new UserDriver();
//        userDriver.insert();
    }

    @Override
    public List<User> select() {
        UserDriver userDriver = new UserDriver();
        return userDriver.select();
    }

}
