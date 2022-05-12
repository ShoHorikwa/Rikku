package com.senior.timeapp.driver.db.entity;

import lombok.Data;

@Data
public class LoginInfoEntity {
    private String user_id;
    private String account_name;
    private String user_password;

    public LoginInfoEntity(String user_id, String account_name, String user_password) {
        this.user_id = user_id;
        this.account_name = account_name;
        this.user_password = user_password;
    }
}
