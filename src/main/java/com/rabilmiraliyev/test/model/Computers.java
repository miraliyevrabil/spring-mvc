package com.rabilmiraliyev.test.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Computers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	//ishciler calsindan ishciler obyekti yaradib onu one to one edirem
	@OneToOne
	private Ishciler ishciler;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ishciler getIshciler() {
		return ishciler;
	}

	public void setIshciler(Ishciler ishciler) {
		this.ishciler = ishciler;
	}

	@Override
	public String toString() {
		return "Computers [id=" + id + ", ishciler=" + ishciler + "]";
	}
	 
	 

	
}
