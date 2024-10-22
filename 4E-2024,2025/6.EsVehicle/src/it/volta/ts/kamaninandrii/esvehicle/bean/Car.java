package it.volta.ts.kamaninandrii.esvehicle.bean;

public class Car extends Vehicle implements Item {

	public Car(String model, String price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		
		return "Name: " + getName() +
			   "\tPrice: " + getPrice();
	}
	
	

	
}
