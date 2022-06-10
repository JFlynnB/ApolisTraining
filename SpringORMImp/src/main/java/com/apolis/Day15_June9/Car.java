package com.apolis.Day15_June9;

public class Car {
	
	private Integer year;
	
	private String make;
	
	private String model;

	public Car(Integer year, String make, String model) {
		this.year = year;
		this.make = make;
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + "]";
	}
	
	

}
