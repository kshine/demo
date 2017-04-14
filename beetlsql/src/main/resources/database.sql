show DATABASES ;

CREATE DATABASE IF NOT EXISTS `beetlsql` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

use beetlsql;

show TABLES ;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `userName` varchar(64) DEFAULT NULL COMMENT '用户名称',
  `roleId` int(11) DEFAULT NULL COMMENT '用户角色',
  `create_date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

show tables;

delete  from  user;
select * from user;