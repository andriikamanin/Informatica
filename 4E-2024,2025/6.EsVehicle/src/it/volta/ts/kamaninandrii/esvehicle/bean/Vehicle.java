package it.volta.ts.kamaninandrii.esvehicle.bean;

public class Vehicle {
	private String name;
	private String price;
	
	
	
	@Override
	public String toString() {
		
		return "Name: " + name +
			   "\tPrice: " + price;
	}

	public Vehicle(String name, String price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
