package com.boredapp.relational.repositories;


import com.boredapp.relational.tables.User;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * For Pagination and Other JPA functionality beyond base CRUD services
 * @see https://docs.spring.io/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 */


public interface UserRespository extends JpaRepository<User,Long>{
    
}
