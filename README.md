# Rikku
## console-app
```zsh
[https://github.com/wipeable-tale/Rikku/tree/main/console-app]

implemented console application that search filerecords which import csv

```
## crud-app
```zsh
[https://github.com/wipeable-tale/Rikku/tree/main/crud-app]

implemented web app that have some functions of CRUD using Mysql on Spring

```
## time-app
```zsh
[https://github.com/wipeable-tale/Rikku/tree/main/timeapp]

implemented web app that is attendance funcitions.
use Spring,Mysql,MyBatis,SpringSecurity
```
## user-api
```zsh
[https://github.com/wipeable-tale/Rikku/tree/main/user-api]

RESTful API has functtions of GET request on Spring
```

### docker参考サイト
```zsh
https://crudzoo.com/blog/docker-postgres
```

### イメージのビルドとコンテナ起動
```zsh
docker compose build --no-cache
docker compose up -d
※エラーが発生して、コンテナが起動しない時は下記参照
https://www.yukiiworks.com/archives/32660
```

### コンテナにアクセス
```zsh
docker exec -it mysql bash
```

### mysqlへのアクセス
```zsh
mysql -u root -p
※パスワードが求められるので、.envに設定したrootパスワードを入力
```

### DBの確認
```zsh
show databases;
use experimental_db;
```

### テーブルの確認
```zsh
show tables;
SELECT * FROM person;
```
