package apolis.Day14Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="mathDept")
@Primary
public class Department {
	
	@Value("Mathmatics")
	private String deptName;
	@Value("320000")
	private int budget;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "The " + deptName + " Department";
	}
	
	
}
