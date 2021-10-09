package com.boredapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Do this before you run the app: 

cd database/docker
docker-compose up -d
docker exec -it bored-project-sql-container psql -Upostgres
create database boreddb
*/

@SpringBootApplication
public class BoredAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoredAppApplication.class, args);
	}

}
