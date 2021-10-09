package com.boredapp.relational.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Rating {
	@Id
    @GeneratedValue
    private long id;

	@Column(name="value",nullable=true)
	int value; //from 1 to 5

}
