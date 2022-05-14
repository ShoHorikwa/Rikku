package com.beginner.userapi.gateway;

import com.beginner.userapi.domain.User;
import com.beginner.userapi.driver.db.UserDriver;
import com.beginner.userapi.driver.db.entity.UserEntity;
import com.beginner.userapi.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGateway  implements UserPort {
    @Autowired
    UserDriver userDriver;


    @Override
    public List<User> selectAll() {
        userDriver.selectAll().map(it -> toEntity)
    }
}
