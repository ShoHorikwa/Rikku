package com.middle.app.driver.db;

import com.middle.app.domein.User;
import com.middle.app.driver.db.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDriver {

    DataSource dataSource = new DataSource();
    private String url = dataSource.getUrl();
    private String user = dataSource.getUsername();
    private String password = dataSource.getPassword();


    public List<UserEntity> select() {
        List<UserEntity> userList = null;
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            PreparedStatement ps = connection.prepareStatement("select * from experimental_db.person;");
            ResultSet rs =ps.executeQuery();
            userList = toUserEntityList(rs);
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return  userList;
    }

    public void insert(UserEntity insertUser) throws Exception {
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            String sql = "insert into experimental_db.person value(?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,insertUser.getId());
            preparedStatement.setString(2,insertUser.getName());
            preparedStatement.setDate( 3,insertUser.getBirthday());
            preparedStatement.setString(4,insertUser.getAddress());
            preparedStatement.setString(5,insertUser.getTelephone());
            preparedStatement.setString(6,insertUser.getMail());
            preparedStatement.execute();

        } catch (Exception ex) {
            throw new Exception(ex);
        }
    }

    public UserEntity selectUser(String id) throws Exception {
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            String sql = "select * from experimental_db.person where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet rs =preparedStatement.executeQuery();
            return toUserEntityList(rs).get(0);
        } catch (Exception ex) {
            throw  new Exception(ex);
        }
    }

    public void delete(String id) throws  Exception {
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            String sql = "delete from experimental_db.person where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            preparedStatement.execute();
        } catch (Exception ex) {
            throw  new Exception(ex);
        }
    }

    public void update(User userUpdateDto) throws Exception {
        try(Connection connection = DriverManager.getConnection(url, user, password);) {
            String sql = "update experimental_db.person set name = ?, email = ?, address = ?, telephone = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userUpdateDto.getName());
            preparedStatement.setString(2,userUpdateDto.getMail());
            preparedStatement.setString(3,userUpdateDto.getAddress());
            preparedStatement.setString(4,userUpdateDto.getTelephone());
            preparedStatement.setString(5,userUpdateDto.getId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            throw  new Exception(ex);
        }
    }


    private List<UserEntity> toUserEntityList(ResultSet rs) throws SQLException {
        List<UserEntity> userList = new ArrayList<>();
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            Date birthday = rs.getDate("birthday");
            String email = rs.getString("email");
            String address = rs.getString("address");
            String telephone = rs.getString("telephone");

            UserEntity userEntity = new UserEntity(id, name, birthday, email, address, telephone);
            userList.add(userEntity);
        }
        return  userList;
    }

}
