DROP TABLE IF EXISTS userdata;
DROP TABLE IF EXISTS incategory;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS activity;
DROP TABLE IF EXISTS rating;
DROP SEQUENCE IF EXISTS hibernate_sequence;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;


CREATE TABLE activity (
	id serial PRIMARY KEY,
	name VARCHAR(150),
	description VARCHAR(150),
	cost DECIMAL(10,3)
);

CREATE TABLE userdata(
	id serial PRIMARY KEY,
	first_name varchar(50),
	last_name varchar(50),
	email varchar(50),
	password varchar(255) 
	);


create table category(
	id serial PRIMARY KEY,
	name VARCHAR(150)	
);

create table rating(
	id serial PRIMARY KEY,
	value int
);

