package it.volta.ts.kamaninandrii.esvehicle;

import it.volta.ts.kamaninandrii.esvehicle.bean.Car;
import it.volta.ts.kamaninandrii.esvehicle.bean.Factory;
import it.volta.ts.kamaninandrii.esvehicle.bean.Garage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory<Car> carFactory = (name, price) -> new Car(name,price);
		
		Garage<Car> cars = new Garage<>(carFactory);
		cars.addItem("toyota", "10k");
		cars.showItems();
		
	
	}

}
