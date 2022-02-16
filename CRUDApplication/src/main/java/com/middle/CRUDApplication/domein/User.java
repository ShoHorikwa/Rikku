package com.middle.CRUDApplication.domein;

import java.sql.Date;

public class User {
    private int id;
    private String name;
    private Date birthday;
    private int age;
    private String mail;

    public User(int id, String name, Date birthday, int age,String email) {
        this.id = id;
        this.birthday = birthday;
        this.age = age;
        this.name = name;
        this.mail = email;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }
}
