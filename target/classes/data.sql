



create unique index idx_auth_username on authorities (username,authority);

INSERT INTO USERS VALUES(1,TRUE,'{noop}secret','user1');


INSERT INTO AUTHORITIES VALUES('user1','ROLE_ADMIN');



insert into CITY (Id , Name1) values (1,'Baki');
insert into CITY (Id , Name1) values (2,'Sumqayıt');
insert into CITY (Id , Name1) values (3,'Gəncə');


insert into ISHCILER (ID, AD,BOLME1,DOGUM_TARIXI,MAAS,SOYAD,UNVAN,CITY_ID) values (1,'Əli' ,'Maliyyə' ,  TO_DATE('25-01-1996','dd-MM-yyyy'), 800 , 'Əliyev' , 'Bakı' , 1);
insert into ISHCILER (ID, AD,BOLME1,DOGUM_TARIXI,MAAS,SOYAD,UNVAN,CITY_ID) values (2,'Vasif' ,'Nəqliyyat' ,  TO_DATE('13-12-1986','dd-MM-yyyy'), 600 , 'Məmmədov' , 'Sumqayıt' , 2);
insert into ISHCILER (ID, AD,BOLME1,DOGUM_TARIXI,MAAS,SOYAD,UNVAN,CITY_ID) values (3,'Murad' ,'Operator' ,  TO_DATE('29-04-1976','dd-MM-yyyy'), 700 , 'Qarayev' , 'Gəncə' , 3);

insert into COMPUTERS (ID , NAME , ISHCILER_ID) values (1, 'Lenovo' , 2 ); 