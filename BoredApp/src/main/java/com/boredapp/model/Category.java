package com.boredapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column(name="name",nullable =false)
	private String name;
	/*@ManyToOne
	@JoinColumn(name="Activity_id",nullable=true)
	private Activity activity;*/
	
	@OneToMany(mappedBy="category",cascade=CascadeType.PERSIST)
	List<Incategory> incategories=new ArrayList<>();
	
	
	

}
