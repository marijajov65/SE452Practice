package com.boredapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class Activity {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column(name="name",nullable=true)
	String name;
	@Column(name="description",nullable=true)
	String description;
	@Column(name="cost",nullable=true)
	double cost;
	
	/*@OneToMany(mappedBy="activity",cascade=CascadeType.PERSIST)
	List<Category> categories=new ArrayList<>();*/
	
	@OneToMany(mappedBy="activity",cascade=CascadeType.PERSIST)
	List<Incategory> incategories=new ArrayList<>();
}
