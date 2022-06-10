package apolis.Day13_June7;

public interface Robot {

	public int getSerialNumber();

	public void setSerialNumber(int serialNumber);

	public Battery getMyBattery();

	public void setMyBattery(Battery myBattery);
	
	public String getFavoriteColor();

	public void setFavoriteColor(String favoriteColor);
	public void speak();
}
