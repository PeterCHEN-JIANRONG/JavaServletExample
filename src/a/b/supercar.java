package a.b;

public class supercar extends Car {
	private int price;

	public supercar(String plate, String brand, String color, int price) {
		super(plate, brand, color);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
