package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class TestEntities {

	public static void main(String[] args) {
		
//		int size = 3;
//		Person tabEmployee [] = new Person[size];
//		tabEmployee[0] = new Employee("Gates", "Bill", 65,"aux USA", new City("Washington", "USA", 7600000), new Capital(null, null, 7600000, "W-M"), "Fondation B&M", 100000.0);
//		tabEmployee[1] = new Employee("Musk", "Elon", 49,"à Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), new Capital(null, null, 800000, null), "Tesla", 150000.0);
//		tabEmployee[2] = new Commercial("Dupont", "robert", 50,"rue des rosiers à Toulouse", new City("Limoges", "France", 133000), new Employee(null, null, 0, null, null, null, "brico", 0), 5.0);
//
//		for (int i = 0; i< tabEmployee.length; i++) {
//			System.out.println(tabEmployee[i]);
//		}
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Employee("Gates", "Bill", 65,"aux USA", new City("Washington", "USA", 7600000), new Capital(null, null, 7600000, "W-M"), "Fondation B&M", 100000.0));
		persons.add(new Employee("Musk", "Elon", 49,"à Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), new Capital(null, null, 800000, null), "Tesla", 150000.0));
		persons.add(new Commercial("Dupont", "robert", 50,"rue des rosiers à Toulouse", new City("Limoges", "France", 133000), new Employee(null, null, 0, null, null, null, "brico", 0), 5.0));
	
		for(Person person : persons) {
			System.out.println(person);
		}
	}
}
