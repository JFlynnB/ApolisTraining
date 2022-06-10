package apolis.Day13Lookup;

public class Battery {
	
	private String chemistry;
	private int capacity;
	public String getChemistry() {
		return chemistry;
	}
	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "A " + chemistry + " battery that holds " + capacity + "mAh";
	}
	
	

}
