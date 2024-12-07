package com.klef.jfsd.exam;

public class Car extends Vehicle{
	
	int numberofDoors;

	public int getNumberofDoors() {
		return numberofDoors;
	}

	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}

	public Car(int id, String name, String type, int maxspeed, String color, int numberofDoors) {
		super(id, name, type, maxspeed, color);
		this.numberofDoors = numberofDoors;
	}
	

}
