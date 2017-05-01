show DATABASES ;
//mysql 创建spring 数据库
create database spring;

use spring;

show TABLES ;

//创建表
create table t_user(
  id int primary key auto_increment,
  username varchar(50),
  password varchar(32)
);
//插入数据
insert into t_user(username, password) VALUES ('王大锤','123456');
insert into t_user(username, password) VALUES ('叫兽','654321');

select * from t_user;