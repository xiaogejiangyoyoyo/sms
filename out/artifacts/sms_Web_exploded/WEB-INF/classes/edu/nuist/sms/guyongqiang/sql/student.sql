drop table if exists students;
create table students(
id int primary key auto_increment,
account varchar(32),
name varchar(32),
password varchar(32),
study_number varchar(32),
gender boolean,
phone  varchar(16),
email varchar(32),
birthday date,
interest varchar(64),
birth_place varchar(32),
introduction text
)ENGINE=INNODB,CHARSET=utf8;

insert into students values(1,'zhangsan','zhangsan','123','NO-01',true,'13912345678','123456789@qq.com','1995-12-12','sing,dance','11','I am good student!');
commit;
/*
 * 新增数据
 * insert into students(account,name,password,study_number,gender,phone,email,birthday,interest,birth_place,introduction) values('lisi','lisi','123','NO-02',true,'13912345678','123456789@qq.com','1995-12-12','sing,dance','11','I am good student!');
 * 删除数据
 * delete from students where id=2;
 * 修改数据
 * update students set gender=false where id=2;
 * 查询数据
 * select *from students;
 * select *from students where id=1;
 */
