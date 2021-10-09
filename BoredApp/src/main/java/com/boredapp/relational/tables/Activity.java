package com.boredapp.relational.tables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import lombok.Data;

@Data
@Entity
@Table(name="activity")
public class Activity {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	@Column(name="name",nullable=true)
	String name;
	@Column(name="description",nullable=true)
	String description;
	@Column(name="cost",nullable=true)
	double cost;

	/*
	@OneToMany(fetch = FetchType.EAGER)
    @JoinTable
    (
        name="user_ratings",
        joinColumns={ @JoinColumn(name="ratings", referencedColumnName="id")  }
    )
    private List<Rating> ratings;

	@OneToMany
    @JoinTable
    (
        name="user_comments",
        joinColumns={ @JoinColumn(name="user_comments", referencedColumnName="id")  }
    )
    private List<Comment> comments;

	*/


}
