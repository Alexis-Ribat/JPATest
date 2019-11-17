
package com.example.JPATest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car extends Vehicule  {
	
	private long id;
	private int numberofseats;

	
	public Car() {
		super();
	}

	public Car(long id, int numberofseats) {
		super();
		this.id = id;
		this.numberofseats = numberofseats;
	}

	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	public int getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}

}	



