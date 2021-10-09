package com.boredapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;


@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="firstName",nullable =false)
    private String firstName;
    @Column(name="lastName",nullable =false)
    private String lastName;
    @Column(name="email",nullable =false,unique = true)
    private String email;
    @Size(min=5,max=150)
    @Column(name="password",nullable =false)
    private String password;
    @Transient
    private String repeatPassword;
}
