package com.example;

public class Vegetable {

	private String name;
	private String color;
	private Double prive;
	
	public Vegetable(){
		
	}
	public Vegetable(String name, String color, Double prive) {
		super();
		this.name = name;
		this.color = color;
		this.prive = prive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrive() {
		return prive;
	}

	public void setPrive(Double prive) {
		this.prive = prive;
	}
	
	
}
