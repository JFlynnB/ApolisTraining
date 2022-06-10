package apolis.Day13Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("Planet Express")
	private String companyName;
	@Autowired
	private SpaceShip ship;
	@Autowired
	private Robot robot;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public SpaceShip getShip() {
		return ship;
	}
	public void setShip(SpaceShip ship) {
		this.ship = ship;
	}
	public Robot getRobot() {
		return robot;
	}
	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	@Override
	public String toString() {
		return "Here we have " + ship + ", and " + robot + ", property of " + companyName;
	}
	
	
}
