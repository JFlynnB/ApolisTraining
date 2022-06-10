package apolis.Day13Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpaceShip {
	@Value("Planet Express Ship")
	private String shipName;
	@Value("Electric Mucus")
	private String color;
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "The good ship: " + shipName + ", freshly painted " + color;
	}
	
	
}
