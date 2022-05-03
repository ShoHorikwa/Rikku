package com.middle.app.driver.db.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class UserEntity {
    private String id;
    private String name;
    private Date birthday;
    private String mail;
    private String address;
    private String telephone;

    public UserEntity(String id, String name, Date birthday, String mail, String address, String telephone) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.mail = mail;
        this.address = address;
        this.telephone = telephone;
    }

}
