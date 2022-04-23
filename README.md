# Rikku
CRUD application on spring framework and easy docker image for postgress

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
