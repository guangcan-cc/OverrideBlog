-- 注意事项
-- 用户表
CREATE TABLE tb_user(
id int(10) AUTO_INCREMENT,
username VARCHAR(20),
password VARCHAR(20),
name VARCHAR(20),
create_time DATE,
email VARCHAR(30),
phone_number VARCHAR(11),
ext VARCHAR(100),
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;