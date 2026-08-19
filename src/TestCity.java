import fr.fms.entities.City;

public class TestCity {

			private static final String COUNTRY = "France";
			
	public static void main(String[] args) {


		City toulouse = new City("Toulouse", COUNTRY, 450000);
		City bordeaux = new City("Bordeaux", COUNTRY, 275292);
		City saintGeoursDeMaremnes = new City("Saint Geours de Maremnes", COUNTRY, 3317);
		
//		System.out.println(toulouse);
//		System.out.println(bordeaux);
//		System.out.println(saintGeoursDeMaremnes);
		
//		toulouse.numberOfInhabitants = toulouse.numberOfInhabitants + 20000; // avec l'attribut numberOfInhabitants dans la classe City en public
//		System.out.println(toulouse);

//		System.out.print(toulouse.getCityName());
//		System.out.print(", " +toulouse.getCountry());
//		System.out.println(", " +toulouse.getNumberOfInhabitants());
//		
//		System.out.print(bordeaux.getCityName());
//		System.out.print(", " +bordeaux.getCountry());
//		System.out.println(", " +bordeaux.getNumberOfInhabitants());
//		
//		System.out.print(saintGeoursDeMaremnes.getCityName());
//		System.out.print(", " +saintGeoursDeMaremnes.getCountry());
//		System.out.println(", " +saintGeoursDeMaremnes.getNumberOfInhabitants());
		
//		toulouse.setNumberOfInhabitants(-200);
//		System.out.print(toulouse);
		
//		City toulouse = new City("Toulouse", COUNTRY, 470000);
//		System.out.println(toulouse);
//		toulouse.setNumberOfInhabitants(370000);
//		System.out.println(toulouse);
		
//		City rabat = new City("Rabat", 577000);
//		System.out.println(rabat);
//		rabat.setCountry("Maroc");
//		System.out.println(rabat);
		
//		toulouse.display();
		bordeaux.display();
		saintGeoursDeMaremnes.display();
		
		System.out.println(toulouse);
		System.out.println(City.getInstanceCount() + " instances sont créées."); 
	}
}
