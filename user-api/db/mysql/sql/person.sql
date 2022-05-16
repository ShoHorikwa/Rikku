DROP SCHEMA IF EXISTS user_api_db;
CREATE SCHEMA user_api_db;
USE user_api_db;

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO user (id, name) VALUES (uuid(), "新井 淳一");
INSERT INTO user (id, name) VALUES (uuid(),"伊藤 広");
