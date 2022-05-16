package com.beginner.userapi.gateway;

import com.beginner.userapi.domain.User;
import com.beginner.userapi.driver.UserDriver;
import com.beginner.userapi.driver.db.entity.UserEntity;
import com.beginner.userapi.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserGateway  implements UserPort {
    @Autowired
    UserDriver userDriver;


    @Override
    public List<User> selectAll() {
        return userDriver.selectAll()
                .stream()
                .map(it -> toUser(it))
                .collect(Collectors.toList());
    }

    @Override
    public User selectOneUser(String id) {
        return  toUser(userDriver.selectOneUser(id));
    }

    private User toUser(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setName(userEntity.getName());
        return  user;
    }
}
