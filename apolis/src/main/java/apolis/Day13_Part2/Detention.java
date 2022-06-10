package apolis.Day13_Part2;

public class Detention {

	private Student ruleBreaker;
	private Teacher assigner;
	private String infraction;
	
	public Detention(Student ruleBreaker) {
		this.ruleBreaker = ruleBreaker;
	}
	
	public Detention(Student ruleBreaker, Teacher assigner) {
		this.ruleBreaker = ruleBreaker;
		this.assigner = assigner;
	}

	public String getInfraction() {
		return infraction;
	}

	public void setInfraction(String infraction) {
		this.infraction = infraction;
	}

	@Override
	public String toString() {
		return "Detention: \ngiven to: " + ruleBreaker + ", \nassigned by: " + assigner + ", \ninfraction: " + infraction;
	}
	
	
}
