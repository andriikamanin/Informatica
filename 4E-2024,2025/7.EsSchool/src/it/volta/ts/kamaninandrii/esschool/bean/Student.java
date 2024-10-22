package it.volta.ts.kamaninandrii.esschool.bean;

import it.volta.ts.kamaninandrii.util.Item;

public class Student extends Item {
	
	
	public Student(String name, String surname, String fiscalCode) {
		super(name,surname,fiscalCode);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return surname;
	}

	@Override
	public String getFiscalCode() {
		// TODO Auto-generated method stub
		return fiscalCode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+ "\t" + getSurname() + "\t" + getFiscalCode();
	}
	
	
	
}
