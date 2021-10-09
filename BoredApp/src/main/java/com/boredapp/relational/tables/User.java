package com.boredapp.relational.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="userdata")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name",nullable =false)
    private String firstName;

    @Column(name="last_name",nullable =false)
    private String lastName;

    @Column(name="email",nullable =false,unique = true)
    @Email
    private String email;

    @Size(min=5,max=150)
    @Column(name="password",nullable =false)
    private String password;

    @Transient
    private String repeatPassword;

    
    @OneToMany
    @JoinTable
    (
        name="user_activities",
        joinColumns={ @JoinColumn(name="user_activities", referencedColumnName="id")  }
    )
    private List<Activity> activities;
}
