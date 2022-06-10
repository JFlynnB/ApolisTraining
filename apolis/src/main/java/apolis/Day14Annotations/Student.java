package apolis.Day14Annotations;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private double gpa;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", gpa: " + gpa;
	}
	
	

}
