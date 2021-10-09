DROP table if exists incategory;
DROP table if exists category;
DROP table if exists activity;
DROP table if exists user;
DROP table if exists rating;
DROP table if exists comment;

CREATE TABLE activity(
	id long AUTO_INCREMENT,
	name VARCHAR(150),
	description VARCHAR(150),
	cost DECIMAL(10,3),
	primary key(id),
	unique (name)

);

create table userdata(
	id long AUTO_INCREMENT,
	first_name varchar(50),
	last_name varchar(50),
	password varchar(255),
    email varchar(50),
	primary key(id)
);


create table category(
	id long AUTO_INCREMENT,
	name VARCHAR(150),
	unique(name),
	primary key(id)
	
);

create table comment(
    id long AUTO_INCREMENT,
    comment_text VARCHAR(150)
);

create table rating(
    id long AUTO_INCREMENT,
    value int
);

