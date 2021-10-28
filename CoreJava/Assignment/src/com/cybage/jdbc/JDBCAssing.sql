create database myDb;
use myDb;

create table employee(
id int auto_increment,
name varchar(50),
designation varchar(50),
salary double,
department varchar(50),
address varchar(50),
primary key(id)
);

CREATE TABLE student (
    id INT AUTO_INCREMENT,
    name VARCHAR(30),
    subject VARCHAR(10),
    PRIMARY KEY (id)
);

delimiter //
drop procedure if exists salaryHike;
CREATE PROCEDURE salaryHike (alphabet varchar(50))
       BEGIN
			UPDATE employee
			SET salary = salary*1.1
            where name like "%a%";
       END
delimiter ;