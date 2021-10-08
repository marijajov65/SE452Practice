package com.boredapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
//@Table(name="incategory",uniqueConstraints= {@UniqueConstraint(columnNames = { "activity_name", "category_name" })})
@IdClass(MyKey.class)
public class Incategory {

	@Id
	@ManyToOne
    @JoinColumn(name="activity_name", nullable=false)
	private Activity activity;
	
	@Id
	@ManyToOne
    @JoinColumn(name="category_name", nullable=false)
	private Category category;
	
	
}
