package com.klef.jfsd.exam;

public class Vehicle {
	private int id;
	private String name;
	private String type;
	private int maxspeed;
	private String color;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehicle(int id, String name, String type, int maxspeed, String color) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.maxspeed = maxspeed;
		this.color = color;
	}
	

}
