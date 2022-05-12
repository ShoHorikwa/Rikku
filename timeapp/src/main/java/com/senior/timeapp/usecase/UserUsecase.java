package com.senior.timeapp.usecase;

import com.senior.timeapp.controller.Controller;
import com.senior.timeapp.controller.Controller.UserInfoDto;
import com.senior.timeapp.controller.Controller.RequestUpdateUserInfoDto;

import com.senior.timeapp.domain.UserInfo;
import com.senior.timeapp.port.UserPort;
import com.senior.timeapp.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class UserUsecase {

    @Autowired
    private UserPort userPort;




    public List<UserInfoDto> select(String id) {

        return  toUserInfoDtoList(userPort.select(id));
    }

    public void makeCommuteTime(boolean isCurrency, String id, String workday) throws Exception {
        Date date = new Date();
        if (!isCurrency) {
            String currentWorkday = DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), date);
            BigDecimal breakTime = new BigDecimal(1.0);
            UserInfo userInfo = new UserInfo(
                    id,
                    DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), currentWorkday),
                    date,
                    null,
                    breakTime,
                    ""
            );
            userPort.insertUserInfo(userInfo);

        } else {
            userPort.updateCommuteTime(id, workday, date);
        }
    }

    public void makeLeaveTime(boolean isCurrency, String id, String workday) throws Exception {
        Date date = new Date();
        if (!isCurrency) {
            String currentWorkday = DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), date);
            BigDecimal breakTime = new BigDecimal(1.9);
            UserInfo userInfo = new UserInfo(
                    id,
                    DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), currentWorkday),
                    null,
                    date,
                    breakTime,
                    ""
            );
            userPort.insertUserInfo(userInfo);

        } else {
            userPort.updateLeaveTime(id, workday, date);
        }
    }

    public void updateUserInfo(RequestUpdateUserInfoDto requestUpdateUserInfoDto) {
        userPort.updateUserInfo(
                new UserInfo(
                        requestUpdateUserInfoDto.getUserId(),
                        DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), requestUpdateUserInfoDto.getWorkday()),
                        DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDDHHmm.getParam(), requestUpdateUserInfoDto.getCommutingTime()),
                        DateUtil.parse(DateUtil.DATE_FORMAT.YYYYMMDDHHmm.getParam(), requestUpdateUserInfoDto.getLeaveTime()),
                        requestUpdateUserInfoDto.getBreakTime(),
                        requestUpdateUserInfoDto.getMemo())
                );
    }

    public RequestUpdateUserInfoDto selectByIdAndWorkday(String id, String workday) throws Exception {
        return  toRequestUpdateUserInfoDto(userPort.selectByIdAndWorkday(id, workday));
    }

    private List<Controller.UserInfoDto> toUserInfoDtoList(List<UserInfo> userInfoList) {
        return userInfoList.stream().map(it -> toUserInfoDto(it)).toList();
    }

    private UserInfoDto toUserInfoDto(UserInfo userInfo) {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserId(userInfo.getUserId());
        userInfoDto.setWorkday(DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(),userInfo.getWorkday()));
        userInfoDto.setCommutingTime(DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDDHHmmss.getParam(), userInfo.getCommutingTime()));
        userInfoDto.setLeaveTime(DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDDHHmmss.getParam(), userInfo.getLeave_time()));
        userInfoDto.setBreakTime(userInfo.getBreakTime().toString());
        userInfoDto.setMemo(userInfo.getMemo());
        return  userInfoDto;
    }

    private RequestUpdateUserInfoDto toRequestUpdateUserInfoDto(UserInfo userInfo) {
        RequestUpdateUserInfoDto requestUpdateUserInfoDto = new RequestUpdateUserInfoDto();
        requestUpdateUserInfoDto.setUserId(userInfo.getUserId());
        requestUpdateUserInfoDto.setWorkday(DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), userInfo.getWorkday()));
        requestUpdateUserInfoDto.setCommutingTime(DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDDHHmm.getParam(), userInfo.getCommutingTime()));
        requestUpdateUserInfoDto.setLeaveTime(DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDDHHmm.getParam(), userInfo.getLeave_time()));
        requestUpdateUserInfoDto.setBreakTime(userInfo.getBreakTime());
        requestUpdateUserInfoDto.setMemo(userInfo.getMemo());
        return  requestUpdateUserInfoDto;
    }

}
