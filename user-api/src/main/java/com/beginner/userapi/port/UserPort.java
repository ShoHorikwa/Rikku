package com.beginner.userapi.port;

import com.beginner.userapi.domain.User;

import java.util.List;

public interface UserPort {
    List<User> selectAll();
}
