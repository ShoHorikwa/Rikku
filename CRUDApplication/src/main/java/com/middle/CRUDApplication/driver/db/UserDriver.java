package com.middle.CRUDApplication.driver.db;

import com.middle.CRUDApplication.controller.Controller.UserRequestDto;
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

    public void insert(UserRequestDto userRequestDto) {
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            String sql = "insert into experimental_db.person value(?, ?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,99);
            preparedStatement.setString(2,userRequestDto.getName());
            preparedStatement.setDate( 3,new Date(620611200000L));
            preparedStatement.setInt(4,999);
            preparedStatement.setString(5,userRequestDto.getEmail());
            preparedStatement.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String makeInsertSQL(UserRequestDto userRequestDto) {
        StringBuilder makedSQL = new StringBuilder();
        makedSQL.append("Insert into experimental_db.person value(")
                .append(99).append(",")
                .append("\"").append(userRequestDto.getName()).append("\"").append(",")
                .append( new Date(620611200000L)).append(",")
                .append(99).append(",")
                .append("\"").append(userRequestDto.getEmail()).append("\"")
                .append(")");

        return  makedSQL.toString();
    }


    private List<User> toUserList(ResultSet rs) throws SQLException {
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            Integer id = rs.getInt("id");
            String name = rs.getString("name");
            Date birthday = rs.getDate("birthday");
            Integer age = rs.getInt("age");
            String email = rs.getString("email");

            User user = new User(id, name, birthday, age, email);
            userList.add(user);
        }
        return  userList;
    }
}
