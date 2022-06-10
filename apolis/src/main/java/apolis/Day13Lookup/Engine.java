package apolis.Day13Lookup;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value("petrol")
	private String fuelType;
	@Value("160")
	private int horsepower;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	@Override
	public String toString() {
		return "a " + fuelType + " engine with " + horsepower + " horsepower";
	}
}
