create database productMgmt;

use productMgmt;

create table product(
id int auto_increment,
name varchar(50),
cost double,
quantity int,
primary key(id)
);

select * from product;
