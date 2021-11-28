package com.rabilmiraliyev.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.Type;
@MappedSuperclass
public class Parent {
		@Column(nullable = false,columnDefinition = "new Date()")
	    @Type(type="date")
	    private Date createDate;
		@Column(nullable = false,columnDefinition = "new Date()")
	    @Type(type = "date")
	    private Date updateDate;

	 @PrePersist
	    private void onCreate()
	    {
	        createDate=new Date();
	        updateDate=new Date();
	    }

	    @PreUpdate
	    private void onUpdate()
	    {
	        updateDate=new Date();
	    }
}
