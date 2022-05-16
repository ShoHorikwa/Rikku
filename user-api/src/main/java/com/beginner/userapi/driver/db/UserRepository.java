package com.beginner.userapi.driver.db;

import com.beginner.userapi.driver.db.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepository {
    private  final String url;
    private final  String user;
    private final String pass;

    public UserRepository() {
        DataSource dataSource = new DataSource();
        this.url = dataSource.getUrl();
        this.user = dataSource.getUsername();
        this.pass = dataSource.getPass();

    }
    public List<UserEntity> selectAll() {
        List<UserEntity> userEntityList = null;
        try(Connection connection = DriverManager.getConnection(url,user,pass);) {
            PreparedStatement ps = connection.prepareStatement("select * from user_api_db.user;");
            ResultSet rs = ps.executeQuery();
            userEntityList = toUserEntities(rs);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return userEntityList;
    }

    public  UserEntity selectOneUser(String id) {
        UserEntity userEntity = null;
        try(Connection connection = DriverManager.getConnection(url,user,pass);) {
            PreparedStatement ps = connection.prepareStatement("select * from user_api_db.user where id = ?;");
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            userEntity = toUserEntities(rs).get(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  userEntity;
    }


    private List<UserEntity> toUserEntities(ResultSet rs) throws SQLException {
        List<UserEntity> userEntityList = new ArrayList<>();
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            UserEntity userEntity = new UserEntity();
            userEntity.setId(id);
            userEntity.setName(name);
            userEntityList.add(userEntity);
        }
        return  userEntityList;
    }
}
