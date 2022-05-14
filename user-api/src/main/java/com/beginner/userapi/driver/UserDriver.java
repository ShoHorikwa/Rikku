package com.beginner.userapi.driver;

import com.beginner.userapi.driver.db.UserRepository;
import com.beginner.userapi.driver.db.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDriver {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> selectAll() {
        return  userRepository.selectAll();
    }
}
