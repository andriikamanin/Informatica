package it.volta.ts.kamaninandrii.esschool;

import it.volta.ts.kamaninandrii.esschool.bean.RegistroElettronico;
import it.volta.ts.kamaninandrii.esschool.bean.Student;
import it.volta.ts.kamaninandrii.util.ItemFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemFactory<Student> studentsFactory = Student::new;
		
		RegistroElettronico<Student>students = new RegistroElettronico<>(studentsFactory);
		
		students.addItem("andrii", "kamanin", "FJHFHHDSJS)@@JF21");
		
		students.showItems();
	}

}
