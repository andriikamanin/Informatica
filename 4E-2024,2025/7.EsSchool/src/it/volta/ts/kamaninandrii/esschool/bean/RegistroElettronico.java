package it.volta.ts.kamaninandrii.esschool.bean;

import java.util.ArrayList;
import java.util.List;

import it.volta.ts.kamaninandrii.util.Item;
import it.volta.ts.kamaninandrii.util.ItemFactory;

public class RegistroElettronico <T extends Item> {
	private List<T> listItems = new ArrayList<>();
	private ItemFactory<T> factory;
	
	public RegistroElettronico(ItemFactory<T> factory) {
		this.factory = factory;
	}
	
	public void addItem(String name, String surname, String fiscalCode) {
		T toAdd = factory.create(name, surname, fiscalCode);
		listItems.add(toAdd);
	}
	
	public void showItems() {
		for(T item : listItems) {
			System.out.println(item);
		}
	}
	
}
