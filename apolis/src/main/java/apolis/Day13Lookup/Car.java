package apolis.Day13Lookup;

public class Car {
	private Engine engine;
	private CarCompany make;
	private int year;
	private String model;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public CarCompany getMake() {
		return make;
	}
	public void setMake(CarCompany make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "a " + year + model + " with " + engine + " made by the " + make;
	}
	
	

}
