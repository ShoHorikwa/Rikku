package com.senior.timeapp.port;

import com.senior.timeapp.domain.LoginInfo;

public interface LoginPort {

    int countDuplicatedLoginInfo(LoginInfo loginInfo) throws  Exception;

    void insertLoginInfo(LoginInfo loginInfo) throws  Exception;
}
