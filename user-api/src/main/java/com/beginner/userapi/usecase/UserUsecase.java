package com.beginner.userapi.usecase;

import com.beginner.userapi.domain.User;
import com.beginner.userapi.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserUsecase {
    @Autowired
    UserPort userPort;

    public List<User> selectAll() {
        return userPort.selectAll();
    }

    public User selectOneUser(String id) {
        return  userPort.selectOneUser(id);
    }
}
