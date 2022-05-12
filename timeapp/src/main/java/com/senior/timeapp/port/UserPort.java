package com.senior.timeapp.port;

import com.senior.timeapp.controller.Controller;
import com.senior.timeapp.domain.LoginInfo;
import com.senior.timeapp.domain.UserInfo;

import java.util.Date;
import java.util.List;

public interface UserPort {
    List<UserInfo> select(String id);

    void insertUserInfo(UserInfo userInfo) throws Exception;

    void updateCommuteTime(String id, String workday, Date date) throws Exception;

    void updateLeaveTime(String id, String workday, Date date) throws Exception;

    UserInfo selectByIdAndWorkday(String id, String workday) throws Exception;

    void updateUserInfo(UserInfo userInfo);
}
