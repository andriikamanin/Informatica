package it.volta.ts.kamaninandrii.esvehicle.bean;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Item> {
	private List<T> listItems = new ArrayList<>();
	private Factory<T> factory ;
	public void addItem(String name, String price) {
		T toAdd = factory.create(name, price);
		
		listItems.add(toAdd);
		
	}
	
	public Garage(Factory<T> factory) {
		this.factory = factory;
	}
	
	public void showItems() {
		for(T item : listItems) {
			System.out.println(item);
		}
	}
	
}
