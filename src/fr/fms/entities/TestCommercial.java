package fr.fms.entities;

public class TestCommercial {

	public static void main(String[] args) {
		
		Commercial robert = new Commercial("Dupont", "robert", 50, "rue des rosiers à Toulouse", new City("Limoges","France", 133000),
							new Employee(null, null, 0, null, null, null, "brico", 0), 5.0);

		System.out.println(robert);
	}
}
