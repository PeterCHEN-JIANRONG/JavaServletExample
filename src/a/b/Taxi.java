package a.b;

public class Taxi extends Car {
	private String driver;

	public Taxi(String plate, String brand, String color, String driver) {
		super(plate, brand, color);
		this.driver = driver;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
}
