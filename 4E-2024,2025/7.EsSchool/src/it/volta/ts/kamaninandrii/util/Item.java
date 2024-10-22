package it.volta.ts.kamaninandrii.util;

public abstract class Item {
	protected String name;
	protected String surname;
	protected String fiscalCode;
	
	
	
	public Item(String name, String surname, String fiscalCode) {
	
		this.name = name;
		this.surname = surname;
		this.fiscalCode = fiscalCode;
	}
	
	public abstract String getName();
	public abstract String getSurname();
	public abstract String getFiscalCode();
	
	
}
