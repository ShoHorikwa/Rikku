package com.middle.CRUDApplication.domein;

import java.sql.Date;

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

    public User() {}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() { return address; }

    public String getTelephone() { return telephone; }

    public String getMail() {
        return mail;
    }
}
