package com.middle.CRUDApplication.domein;

public class User {
    private String name;
    private String mail;
//    private String tell;


//
//    public User(String name, boolean sex, String mail, String tell, int job, int skill) {
//        this.name = name;
//        this.sex = sex;
//        this.mail = mail;
//        this.tell = tell;
//        this.job = job;
//        this.skill = skill;
//    }

    public User(String name, String email) {
        this.name = name;
        this.mail = email;
    }
    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

//    public String getTell() {
//        return tell;
//    }
//
//    public int getJob() {
//        return job;
//    }
//
//    public int getSkill() {
//        return skill;
//    }
}
