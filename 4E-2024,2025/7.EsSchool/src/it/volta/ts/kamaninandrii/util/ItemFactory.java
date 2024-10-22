package it.volta.ts.kamaninandrii.util;

public interface ItemFactory<T extends Item> {
	T create(String name, String surname, String fiscalCode);
}
