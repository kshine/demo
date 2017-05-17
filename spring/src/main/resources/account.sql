create table account(
	id int PRIMARY key auto_increment,
  name varchar(50),
  money int
);

select * from account;

insert into account(name,money) values('tom',1000);
insert into account(name,money) values('jack',1000);