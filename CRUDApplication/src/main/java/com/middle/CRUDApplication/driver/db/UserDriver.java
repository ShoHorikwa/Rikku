package com.middle.CRUDApplication.driver.db;

import com.middle.CRUDApplication.domein.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDriver {

    DataSource dataSource = new DataSource();
//    private String url = dataSource.getUrl();
//    private String user = dataSource.getUser();
//    private String password = dataSource.getPassword();
    private String url = dataSource.getUrl();
    private String user = dataSource.getUsername();
    private String password = dataSource.getPassword();

//    public void insert() {
//
//    }

    public List<User> select() {

        List<User> userList = null;
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            PreparedStatement ps = connection.prepareStatement("select * from experimental_db.person;");
            ResultSet rs =ps.executeQuery();
            userList = toUserList(rs);
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return  userList;
    }


    private List<User> toUserList(ResultSet rs) throws SQLException {
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("name");
            String email = rs.getString("email");

            User user = new User(name, email);
            userList.add(user);
            //@TODO 後で消す（デバッグ確認用）
            System.out.println("名前：" + user.getName());
        }
        return  userList;
    }


}
