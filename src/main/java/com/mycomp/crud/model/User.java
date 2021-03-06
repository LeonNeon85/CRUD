package com.mycomp.crud.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;



@Entity
@Table(name = "Persons")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, length = 8)
	private int id;
	
	@Column(name = "name", length = 25)
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "isAdmin")
	private boolean admin; 
	
	@Column(name = "createdDate")	
	private Date createdDate;
				
	public User() {		
	}
			
	public User(String name, int age, boolean admin, Date createdDate) {
		this.name = name;
		this.age = age;
		this.admin = admin;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getAdmin() {
		return admin;
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", admin=" + admin + ", createdDate="
				+ createdDate + "]";
	}
	
	 
}
