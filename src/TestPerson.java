import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.fms.entities.City;

public class TestPerson {

	public static void main(String[] args) {
		
		System.out.println("Liste des personnalités");
		Person manu = new Person("Macron", "Emmanuel", 43, "L'Elysée à Paris", new City("Amiens", "France"));
		Person nicolas = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person boris = new Person("Johnson", "Boris", 56, "Downing street à London", new City("New York", "Etats-Unis"));
		Person gerard = new Person("Depardieu", "Gérard", 72, "Moscou", new City("Chateauroux", "France"));
		Person leny = new Person("Kravitz", "Leny", 56, "Hotel particulier à Paris", new City("New York", "USA"));
		Person jennifer = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "USA"));

		
		List<Person> persons = new ArrayList<Person>();
		persons.add(manu);
		persons.add(nicolas);
		persons.add(boris);
		persons.add(gerard);
		persons.add(leny);
		persons.add(jennifer);
		
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getAddress().contains("Paris")||person.getHometown().getCountry().contains("France")) {
				System.out.println(person);
			}
		}
		
	}

}
