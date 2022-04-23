DROP SCHEMA IF EXISTS experimental_db;
CREATE SCHEMA experimental_db;
USE experimental_db;

DROP TABLE IF EXISTS person;

CREATE TABLE person
(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(255),
    birthday DATE,
    address VARCHAR(255),
    telephone VARCHAR(255),
    email VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO person (id, name, address, telephone, birthday, email) VALUES (uuid(), "新井 淳一", "東京都AA区BB1-23-4", "09012345678",'1990-04-01', 'arai@sample.com');
INSERT INTO person (id, name, address, telephone, birthday, email) VALUES (uuid(),"伊藤 広", "埼玉県CC市DD町567-890-1", "08012748274", '1991-06-23', 'ito@sample.com');
INSERT INTO person (id, name, address, telephone, birthday, email) VALUES (uuid(),"宇都宮 隆", "千葉県EE市FFFFFF町234-56-78", "09017386574", '1995-06-07', 'utsunomiya@sample.com');
INSERT INTO person (id, name, address, telephone, birthday, email) VALUES (uuid(),"江本 裕美", "神奈川県GGGGGGG市HH町9-1234-5", "08073489127", '1990-11-12', 'emoto@sample.com');
INSERT INTO person (id, name, address, telephone, birthday, email) VALUES (uuid(),"緒方 恵美", "静岡県IIIIIIII市JJJJJJ町678-9-1", "09000000000001", '1996-12-01', 'ogata@sample.com');
