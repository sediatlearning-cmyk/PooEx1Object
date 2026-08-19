package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		Employee bill = new Employee("Gates", "Bill", 65, "aux USA", new City("Washington","USA", 7600000), new Capital(null, null, 7600000, "W-M"), "Fondation B&M", 100000.0);
		Employee elon = new Employee("Musk", "Elon", 49, "à Palo Alto", new City("Pretoria","Afrique du Sud",800000), new Capital(null, null, 800000, null), "Tesla", 150000.0);
	
		System.out.println(bill);
		System.out.println(elon);
	
	
	}
}
