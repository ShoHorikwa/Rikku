package com.senior.timeapp.gateway;

import com.mysql.cj.util.StringUtils;
import com.senior.timeapp.domain.LoginInfo;
import com.senior.timeapp.driver.db.UserMapper;
import com.senior.timeapp.driver.db.entity.LoginInfoEntity;
import com.senior.timeapp.port.LoginPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginGateway implements UserDetailsService, LoginPort {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserMapper userMapper;

    @Override
    public  int countDuplicatedLoginInfo(LoginInfo loginInfo) throws Exception {
        return  userMapper.countDuplicatedLoginInfo(toEntity(loginInfo));
    }

    @Override
    public void insertLoginInfo(LoginInfo loginInfo) {
        userMapper.insertLoginInfo(toEntity(loginInfo));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginInfoEntity loginInfoEntity = userMapper.selectLoginInfo(username);
        if(null != loginInfoEntity) {
            LoginInfo loginInfo = toLogininfo(loginInfoEntity);
            checkAuthentification(loginInfo);
            return loginInfo;
        } else {
            throw  new UsernameNotFoundException("ユーザ情報が存在しません");
        }
    }

    private LoginInfo toLogininfo(LoginInfoEntity loginInfoEntity) {
        return  new LoginInfo(
                loginInfoEntity.getUser_id(),
                loginInfoEntity.getAccount_name(),
                loginInfoEntity.getUser_password(),
                true
        );
    }

    private LoginInfoEntity toEntity(LoginInfo loginInfo) {
        return  new LoginInfoEntity(
                loginInfo.getUserId(),
                loginInfo.getAccountName(),
                loginInfo.getPassword());

    }

    private void checkAuthentification(LoginInfo loginInfo) {

        if(StringUtils.isNullOrEmpty(loginInfo.getUsername())) throw  new UsernameNotFoundException("ユーザ情報が存在しません");

        if(StringUtils.isNullOrEmpty(loginInfo.getPassword())) throw new UsernameNotFoundException("ユーザ情報が存在しません");

        if(!loginInfo.isAccountNonExpired() || !loginInfo.isAccountNonLocked() || !loginInfo.isCredentialsNonExpired()
        || !loginInfo.isEnabled()) throw  new UsernameNotFoundException("ユーザ情報に誤りがあります");

    }
}
