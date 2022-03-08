create table manager (eid int primary key auto_increment,fname varchar(30), 
lname varchar(30) ,phone bigint, password varchar(30)) ;
use world;
show databases;
select * from manager;
desc manager;
insert into manager (fname, lname ,phone ,password) value('root','root',0123456789,'root');
insert into manager (fname, lname, phone, password) value('shivam' ,'choudhary',889451254 ,'shivam123');
insert into manager (fname, lname, phone, password) value('deepak' ,'choudhary',9324781858 ,'deepak123');
insert into manager (fname, lname, phone, password) value('suraj' ,'choudhary',864 ,'suraj');
drop table manager;
commit;