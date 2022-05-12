package com.senior.timeapp.driver.db;

import com.senior.timeapp.driver.db.entity.LoginInfoEntity;
import com.senior.timeapp.driver.db.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {

    List<UserInfoEntity> select(String id);

    int countDuplicatedLoginInfo(LoginInfoEntity loginInfoEntity);

    void insertUserInfo(UserInfoEntity userInfoEntity);

    void insertLoginInfo(LoginInfoEntity loginInfoEntity);

    void updateCommuteTime(String id, Date workday, Date date);

    void updateLeaveTime(String id, Date workday, Date date);

    UserInfoEntity selectByIdAndWorkday(String id, Date workday);

    void updateUserInfo(UserInfoEntity userInfoEntity);

    LoginInfoEntity selectLoginInfo(String username);
}
