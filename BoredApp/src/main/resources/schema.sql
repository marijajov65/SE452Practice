DROP table if exists incategory;
DROP table if exists category;
DROP table if exists activity;
DROP table if exists user;

CREATE TABLE activity(
	id int AUTO_INCREMENT,
	name VARCHAR(150),
	description VARCHAR(150),
	cost DOUBLE,
	primary key(id),
	unique (name)

);

create table user(
	id int AUTO_INCREMENT,
	firstname varchar(50),
	lastname varchar(50),
	password varchar(255),
	
	primary key(id)
);



create table category(
	id int AUTO_INCREMENT,
	name VARCHAR(150),
	
	unique(name),
	primary key(id)
	
);

create table incategory(
	activity_name VARCHAR(150),
	category_name VARCHAR(150),
	
	primary key(activity_name,category_name),
	
	foreign key(activity_name) references activity(name),
	foreign key(category_name) references category(name)
	
	
	

);
