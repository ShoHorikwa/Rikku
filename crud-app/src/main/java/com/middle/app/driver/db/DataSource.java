package com.middle.app.driver.db;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

@Component
public class DataSource {
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;
//
//    public String getUrl() {
//        return url;
//    }
//
//    public String getUser() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }

    public String url;
    public String username;
    public String password;

    public DataSource() {
        Properties properties = new Properties();
        try {
            properties.load(Files.newBufferedReader(Path.of(getClass().getClassLoader().getResource("application.properties").getPath())));
            this.url = properties.getProperty("jdbc.url");
            this.username = properties.getProperty("jdbc.username");
            this.password = properties.getProperty("jdbc.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
