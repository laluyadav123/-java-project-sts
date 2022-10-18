package com.association;

public class Car {
	
	private int carid;
	private Driver driver;
	
	
	public Car(int carid, Driver driver) {
		super();
		this.carid = carid;
		this.driver = driver;
	}

	

	public Car(int carid) {
		super();
		this.carid = carid;
	}
	
	

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", driver=" + driver + "]";
	}


	
	
	

}
