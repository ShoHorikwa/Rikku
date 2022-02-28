package com.middle.CRUDApplication.usecase;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
import com.middle.CRUDApplication.controller.Controller.UserUpdateDto;
import com.middle.CRUDApplication.domein.User;
import com.middle.CRUDApplication.gateway.UserGateway;
import com.middle.CRUDApplication.port.UserPort;
import com.middle.CRUDApplication.util.DateUtil;

import java.util.List;
import java.util.UUID;

public class UserUsecase {

    UserPort userPort;

    public List<User> select() {
        userPort = new UserGateway();
        return  userPort.select();
    }

    public void insert(UserRequestDto userRequestDto) throws Exception {
        userPort = new UserGateway();

        userPort.insert(toUser(userRequestDto));
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
        userPort.update(toUser(userUpdateDto));
    }

    private User toUser(UserRequestDto userRequestDto) {
        return new User(String.valueOf(UUID.randomUUID()),userRequestDto.getName(), DateUtil.stringToDate(userRequestDto.getBirthday()),userRequestDto.getEmail(), userRequestDto.getAddress(), userRequestDto.getTelephone());
    }

    private User toUser(UserUpdateDto userUpdateDto) {
        return new User(userUpdateDto.getId(),userUpdateDto.getName(), userUpdateDto.getBirthday(),userUpdateDto.getMail(), userUpdateDto.getAddress(), userUpdateDto.getTelephone());
    }
}
