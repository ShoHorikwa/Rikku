package com.middle.CRUDApplication.port;

import com.middle.CRUDApplication.domein.User;

import java.util.List;

public interface UserPort {
    void insert();
    List<User> select();
}
