package com.example.JPATest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Person {
	
	private long id;
	private String name;
	private int age;
	private City city;
	private char sexe;
	

	public Person() {
		super();
	}

	public Person(long id, String name, int age, char sexe) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sexe = sexe;
	}
	
	@ManyToOne
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	

}