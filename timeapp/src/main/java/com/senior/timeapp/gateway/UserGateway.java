package com.senior.timeapp.gateway;

import com.senior.timeapp.domain.UserInfo;
import com.senior.timeapp.driver.db.UserMapper;
import com.senior.timeapp.driver.db.entity.UserInfoEntity;
import com.senior.timeapp.port.UserPort;
import com.senior.timeapp.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class UserGateway implements UserPort {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> select(String id) {
        List<UserInfo> userInfoList = userMapper.select(id).stream().map(it -> toUserInfo(it)).toList();
        return userInfoList;
    }

    @Override
    public  void insertUserInfo(UserInfo userInfo) throws Exception{
        userMapper.insertUserInfo(toUserInfoEntity(userInfo));
    }

    @Override
    public void updateCommuteTime(String id, String workday, Date date) throws Exception {
        userMapper.updateCommuteTime(id, DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), workday), date);
    }

    @Override
    public void updateLeaveTime(String id, String workday, Date date) throws Exception {
        userMapper.updateLeaveTime(id, DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), workday), date);
    }

    @Override
    public UserInfo selectByIdAndWorkday(String id, String workday) throws  Exception{
        return  toUserInfo(userMapper.selectByIdAndWorkday(id,DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), workday)));
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userMapper.updateUserInfo(toUserInfoEntity(userInfo));
    }

    private UserInfo toUserInfo(com.senior.timeapp.driver.db.entity.UserInfoEntity userInfoEntity) {
        UserInfo userinfo  = new UserInfo(
                userInfoEntity.getUser_id(),
                userInfoEntity.getWorkday(),
                userInfoEntity.getCommuting_time(),
                userInfoEntity.getLeave_time(),
                userInfoEntity.getBreak_time(),
                userInfoEntity.getMemo()
                );
        return  userinfo;
    }

    private UserInfoEntity toUserInfoEntity(UserInfo userInfo) {
        return  new UserInfoEntity(
                userInfo.getUserId(),
                userInfo.getWorkday(),
                userInfo.getCommutingTime(),
                userInfo.getLeave_time(),
                userInfo.getBreakTime(),
                userInfo.getMemo()
        );
    }
}
