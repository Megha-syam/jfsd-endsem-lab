package com.klef.jfsd.exam;

public class Truck extends Vehicle {
	int loadCapacity;

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public Truck(int id, String name, String type, int maxspeed, String color, int loadCapacity) {
		super(id, name, type, maxspeed, color);
		this.loadCapacity = loadCapacity;
	}
	

}
