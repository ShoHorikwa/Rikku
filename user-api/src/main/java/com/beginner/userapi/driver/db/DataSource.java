package com.beginner.userapi.driver.db;

import org.springframework.stereotype.Service;

import java.util.ResourceBundle;

@Service
public class DataSource {
    private static final String DATASOURCE_NAME = "application";

    public enum DATASOURCE {
        NAME("application"),
        URL("jdbc.mysql.url"),
        USER("jdbc.mysql.user"),
        PASS("jdbc.mysql.password"),
        ;
        String value;

        DATASOURCE(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
    private final String url;
    private final String username;
    private final String pass;

    public DataSource() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(DATASOURCE.NAME.getValue());
        this.url = resourceBundle.getString(DATASOURCE.URL.getValue());
        this.username = resourceBundle.getString(DATASOURCE.USER.getValue());
        this.pass = resourceBundle.getString(DATASOURCE.PASS.getValue());
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }
}
