



create unique index idx_auth_username on authorities (username,authority);

INSERT INTO USERS VALUES(1,TRUE,'{noop}secret','user1');


INSERT INTO AUTHORITIES VALUES('user1','ROLE_ADMIN');


insert into CITY (Id , Name1) values (1,'Baki');
insert into CITY (Id , Name1) values (2,'Sumqayıt');
insert into CITY (Id , Name1) values (3,'Gəncə');
