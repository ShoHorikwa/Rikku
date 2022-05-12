DROP SCHEMA IF EXISTS attendance_db;
CREATE SCHEMA attendance_db;
USE attendance_db;

DROP TABLE IF EXISTS user_login;
DROP TABLE IF EXISTS user_info;

CREATE TABLE user_login
(
    user_id VARCHAR(36) NOT NULL,
    account_name VARCHAR(255) NOT NULL,
    user_password VARCHAR(255) NOT NULL,
    PRIMARY KEY(user_id)
);

CREATE TABLE user_info
(
    user_id VARCHAR(36) NOT NULL,
    workday DATE,
    commuting_time DATETIME,
    leave_time DATETIME,
    break_time DECIMAL(2,1),
    memo VARCHAR(255),
    PRIMARY KEY(user_id,workday),
    FOREIGN KEY (user_id) REFERENCES user_login(user_id)
);


-- ログイン情報:
-- ユーザ名「test」
-- パスワード「test」
INSERT INTO user_login (user_id, account_name, user_password) VALUES ("30883403-cc8b-4252-8fad-f393234aacca", "test", "$2a$10$rSOJ0vXgaxK1a/AvSUvw3uYpNEMCnAk4BG11s/Hdy.s8Pc3NiD3Su");
INSERT INTO user_info (user_id, workday, commuting_time, leave_time, break_time, memo) VALUES ("30883403-cc8b-4252-8fad-f393234aacca", "2012-12-12", "2021-11-01 09:30:59.999999", "2021-11-01 17:30:59.999999", 1.5, "メモ");