package com.rabilmiraliyev.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String name1;//sql query yazanda computers deki name ile qarisirdi die name 1 eledim
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name1 + "]";
	}
	
}
