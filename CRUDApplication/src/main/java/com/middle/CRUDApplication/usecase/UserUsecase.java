package com.middle.CRUDApplication.usecase;

import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.gateway.UserGateway;
import com.middle.CRUDApplication.port.UserPort;

import java.util.List;

public class UserUsecase {

//    public void insert() {
//        UserPort userPort = new UserGateway();
//        userPort.insert();
//    }

    public List<User> select() {
        UserPort userPort = new UserGateway();
        return  userPort.select();
    }
}
