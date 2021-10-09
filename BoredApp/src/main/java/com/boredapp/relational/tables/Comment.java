package com.boredapp.relational.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Comment {
	@Id
    @GeneratedValue
    private long id;

    @Column(name="comment_text", nullable=false)
    private String commentText;

}