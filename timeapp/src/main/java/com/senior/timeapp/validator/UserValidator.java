package com.senior.timeapp.validator;

import com.senior.timeapp.controller.Controller;
import com.senior.timeapp.controller.Controller.UserInfoDto;
import com.senior.timeapp.util.DateUtil;

import java.util.Date;
import java.util.List;

public class UserValidator {

    public static boolean isCurrency(UserInfoDto currencyUserInfoDto) {
        String nowWorkDay = DateUtil.formatter(DateUtil.DATE_FORMAT.YYYYMMDD.getParam(), new Date());
        if(currencyUserInfoDto.getWorkday().equals(nowWorkDay)) {
            return true;
        } else {
            return false;
        }
    }
}
