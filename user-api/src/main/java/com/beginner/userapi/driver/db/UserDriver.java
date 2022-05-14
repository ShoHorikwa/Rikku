package com.beginner.userapi.driver.db;

import com.beginner.userapi.driver.db.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDriver {

    public List<UserEntity> selectAll() {
        List<UserEntity> userEntityList = new ArrayList<>();
        return  userEntityList;
    }
}
