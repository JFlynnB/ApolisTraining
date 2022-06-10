package apolis.Day13_June7;

public class BendingUnit implements Robot{

private int serialNumber;
	
	private Battery myBattery;
	
	private String favoriteColor;

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Battery getMyBattery() {
		return myBattery;
	}

	public void setMyBattery(Battery myBattery) {
		this.myBattery = myBattery;
	}
	
	public void speak() {
		System.out.println("Please insert girder");
	}

}
