# springbootmysqlmongo
This is the simple integration of springboot, mongo and mysql databases


#For quicker initialisation. 

#Run the below sql to setup the data on mysql

CREATE DATABASE TEST;
USE TEST;
CREATE TABLE users (id VARCHAR(20), name VARCHAR(20), age int);
insert into users values ('abc','Harsha',25);
insert into users values ('def','Vishnu',24);


#Run the below queries to setup the data on mysql
use test;
db.users.insert({"_id":"123","name":"Somanna",age:48});
db.users.insert({"_id":"456","name":"Dhanalakshmi",age:43});

#boom and if you run the App, it should work!