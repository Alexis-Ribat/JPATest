package com.example.JPATest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public abstract class Vehicule {
	
	//private List<Car> car = new ArrayList<Car>();
	
	private long id;
	private String marque;
	private String plateNumber;
	
	
	public Vehicule() {
		super();
	}
	
	public Vehicule(long id, String marque, String plateNumber) {
		super();
		this.id = id;
		this.marque = marque;
		this.plateNumber = plateNumber;
	}
	
	
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	
}
