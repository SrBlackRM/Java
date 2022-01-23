package application;

public class Product {
	private String name;
	private double price;
	public int amountStocked;
	
	
	public Product() {
		name = "Product without name.";
		price = 0;
		amountStocked = 0;
	}
	
	public Product(String name, double price, int amountStocked) {
		this.name = name;
		this.price = price;
		this.amountStocked = amountStocked;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getPrice() {
		System.out.println(price);
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getTotal() {
		double total = price * amountStocked;
		return total;
	}
}

