create table users(
      username varchar(128) not null primary key,
      password varchar(512) not null,
      enabled boolean not null);

create table authorities (
      username varchar(128) not null,
      authority varchar(128) not null);

create unique index idx_auth_username on authorities (username,authority);




INSERT INTO USERS VALUES('user1','{noop}secret',TRUE);
INSERT INTO USERS VALUES('user2','{noop}secret',TRUE);

INSERT INTO AUTHORITIES VALUES('user1','ROLE_ADMIN');
INSERT INTO AUTHORITIES VALUES('user2','ROLE_EDITOR');




insert into CITY (Id , Name1) values (1,'Baki');
insert into CITY (Id , Name1) values (2,'Sumqayıt');
insert into CITY (Id , Name1) values (3,'Gəncə');
