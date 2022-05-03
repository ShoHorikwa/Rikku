package com.middle.app.domein;

import lombok.Getter;

import java.sql.Date;

@Getter
public class User {
    private String id;
    private String name;
    private Date birthday;
    private String mail;
    private String address;
    private String telephone;

    public User(String id, String name, Date birthday, String email, String address, String telephone) {
        this.id = id;
        this.birthday = birthday;
        this.name = name;
        this.mail = email;
        this.address = address;
        this.telephone = telephone;
    }
}
