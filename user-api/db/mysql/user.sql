DROP SCHEMA IF EXISTS user_db;
CREATE SCHEMA user_db;
USE user_db;

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO user (id, name) VALUES (uuid(), "新井 淳一");
INSERT INTO user (id, name) VALUES (uuid(),"伊藤 広");
INSERT INTO user (id, name) VALUES (uuid(),"宇都宮 隆");
INSERT INTO user (id, name) VALUES (uuid(),"江本 裕美");
INSERT INTO user (id, name) VALUES (uuid(),"緒方 恵美");
