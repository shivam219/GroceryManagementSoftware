create table OrderHistory (oid int primary key auto_increment,item int, quantity int, price int);

insert into OrderHistory values(2,5,30,230);	
select*from OrderHistory;
drop table OrderHistory;
desc orderhistory;
commit