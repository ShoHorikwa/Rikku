package com.middle.app.gateway;


import com.middle.app.domein.User;
import com.middle.app.driver.db.UserDriver;
import com.middle.app.driver.db.entity.UserEntity;
import com.middle.app.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGateway implements UserPort {

    UserDriver userDriver;

    public UserGateway() {
        userDriver = new UserDriver();
    }


    @Override
    public void insert(User user) throws Exception {
        userDriver.insert(toUserEntity(user));
    }

    @Override
    public List<User> select() {
        return userDriver.select().stream().map(it -> toUser(it)).toList();
    }

    @Override
    public User selectUser(String id) throws Exception {
        return toUser(userDriver.selectUser(id));
    }

    @Override
    public void delete(String id) throws Exception {
        userDriver.delete(id);
    }

    @Override
    public void update(User updateUser) throws Exception {
        userDriver.update(updateUser);
    }

    private UserEntity toUserEntity(User user) {
        return new UserEntity(
                user.getId(),
                user.getName(),
                user.getBirthday(),
                user.getMail(),
                user.getAddress(),
                user.getTelephone()
        );
    }

    private User toUser(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getName(),
                entity.getBirthday(),
                entity.getMail(),
                entity.getAddress(),
                entity.getTelephone());
    }
}
