use world;
create table Gvegetable( pid int auto_increment primary key, pname varchar(50) not null, pack varchar(10) not null,
quantity int not null,price int not null);
desc Gvegetable;
insert into Gvegetable (pname,pack,quantity,price) values('tt','tt',1,2);
insert into Gvegetable (pname,pack,quantity,price) values 
('Apple','1kd',60,120),
('Bannana','12pc',80,40),
('Orange','1kg',120,60),
('Mango','1kg',140,65),
('Grapes','1kg',70,50),
('Pineapple','1pcs',45,38),
('Pomegranate','1pcs',80,55),
('Avocado','1kg',70,42),
('Coconut','1pcs',60,30),
('papaya','1pcs',200,40),
('Watermelon','1pcs',150,45),
('Strawberry','500gm',90,150),
('Cherry','1kg',80,62),
('Apricot','1kg',70,50),
('Kiwi','1kg',130,85),
('Lime','500gm',160,30),
('Pear','1kg',164,74),
('Peach','1kg',135,50),
('Tamerind','500gm',170,67),
('Jackfruit','500gm',140,42);
insert into Gvegetable (pname,pack,quantity,price) values 
('Almond','1kg',60,800),
('Apricot','500gm',80,300),
('Cashew','1kg',75,750),
('Chestnut','1kg',120,860),
('Raisins','500gm',200,140),
('Dates','300gm',60,80),
('Figs','1kg',80,120),
('Fennel','1kg',150,200),
('Dry-Coconut','1kg',60,50),
('Flax','200',180,80),
('Fox-Nuts','500gm',300,75),
('Groundnut','1kg',220,120),
('Pine-Nut','1kg',100,85),
('Pistachio','500gm',125,140),
('Poppy-Seeds','250gm',130,240),
('Prunes','500gm',160,200),
('Saffron','200gm',80,400),
('Sesame','750gm',220,300),
('Walnut','500gm',200,250),
('Pumpkin-Seeds','100gm',80,150),
('Charoli','500gm',130,200),
('Betel-Nut','1kg',80,300),
('Arrowroot','750gm',154,420),
('Watermelon-seeds','500gm',120,250),
('Cudpahnut','1kg',130,450);




insert into Gvegetable (pname,pack,quantity,price) values 
('Mint','1pcs',300,60),
('Lettuce','1pcs',200,58),
('Cabbage','1pcs',200,45),
('Cauliflower','1pcs',200,42),
('Leek','1pcs',200,40),
('Eggplant','500gm',60,60),
('Brussels','1kg',200,60),
('Beetroot','1kg',150,40),
('Fennel','1kg',300,50),
('Coriander','500gm',180,20),
('Knol Khol','500gm',300,22),
('Turnip','1kg',220,28),
('Bell Pepper','1kg',100,52),
('Bitter gourd','500gm',125,40),
('Radish','10pcs',130,35),
('Garlic','500gm',160,50),
('Spinach','1kg',140,34),
('Zuchhini','10pcs',220,38),
('Ginger','250',200,30),
('Corn','1pcs',400,12),
('Pumpkin','1pcs',130,42),
('Okra','1kg',180,45),
('Red chillies','1kg',200,75),
('Celery','500gm',120,60),
('Moringa','1kg',150,34),
('Tomato','1kg',160,30);


select * from gvegetable where quantity > 0;
select*from Gvegetable where pid = 2343;
update vegetable set pack='1kg' where pid=8;
delete from Gvegetable where pid = 200;
drop table Gvegetable;
select * from gvegetable order by pid desc limit 1;
commit;