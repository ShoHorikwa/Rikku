package com.middle.app.usecase;

import com.middle.app.controller.Controller.UserRequestDto;
import com.middle.app.controller.Controller.UserUpdateDto;
import com.middle.app.domein.User;
import com.middle.app.gateway.UserGateway;
import com.middle.app.port.UserPort;
import com.middle.app.util.DateUtil;

import java.util.List;
import java.util.UUID;

public class UserUsecase {

    UserPort userPort;

    public UserUsecase() {
        userPort = new UserGateway();
    }

    public List<User> select() {
        return userPort.select();
    }

    public void insert(UserRequestDto userRequestDto) throws Exception {
        userPort.insert(toUser(userRequestDto));
    }

    public User selectUser(String id) throws Exception {
        return userPort.selectUser(id);
    }

    public void delete(String id) throws Exception {
        userPort.delete(id);
    }

    public void update(UserUpdateDto userUpdateDto) throws Exception {
        userPort.update(toUser(userUpdateDto));
    }

    private User toUser(UserRequestDto userRequestDto) {
        return new User(String.valueOf(UUID.randomUUID()), userRequestDto.getName(), DateUtil.stringToDate(userRequestDto.getBirthday()), userRequestDto.getEmail(), userRequestDto.getAddress(), userRequestDto.getTelephone());
    }

    private User toUser(UserUpdateDto userUpdateDto) {
        return new User(userUpdateDto.getId(), userUpdateDto.getName(), userUpdateDto.getBirthday(), userUpdateDto.getMail(), userUpdateDto.getAddress(), userUpdateDto.getTelephone());
    }
}
