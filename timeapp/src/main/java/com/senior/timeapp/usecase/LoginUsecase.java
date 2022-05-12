package com.senior.timeapp.usecase;

import com.senior.timeapp.controller.Controller;
import com.senior.timeapp.controller.Controller.RequestInsertLoginInfoDto;
import com.senior.timeapp.domain.LoginInfo;
import com.senior.timeapp.port.LoginPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LoginUsecase {

    @Autowired
    LoginPort loginPort;


    public boolean checkLogignInfo(RequestInsertLoginInfoDto requestInsertLoginInfoDto) throws  Exception{
        boolean isDuplicated = false;
        int duplicatedCount = loginPort.countDuplicatedLoginInfo(toLoginInfo(requestInsertLoginInfoDto));
        if(0 != duplicatedCount) isDuplicated = true;
        return  isDuplicated;

    }
    public void createLoginInfo(RequestInsertLoginInfoDto requestInsertLoginInfoDto) throws Exception {
        loginPort.insertLoginInfo(toLoginInfo(requestInsertLoginInfoDto));
    }


    private LoginInfo toLoginInfo(Controller.RequestInsertLoginInfoDto requestInsertLoginInfoDto) {
        return new LoginInfo(
                String.valueOf(UUID.randomUUID()),
                requestInsertLoginInfoDto.getAccountName(),
                new BCryptPasswordEncoder().encode(requestInsertLoginInfoDto.getPassword()),
                true
        );
    }
}
