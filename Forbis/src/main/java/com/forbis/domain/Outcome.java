package com.forbis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //lets us create a database table as if it were a java object
@Table(name="outcomes")
public class Outcome {

	private Long id;
	private String countedText;
	
	
	@Id @GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "counted_text", length = 3000)
	public String getCountedText() {
		return countedText;
	}
	public void setCountedText(String countedText) {
		this.countedText = countedText;
	}
	
}
