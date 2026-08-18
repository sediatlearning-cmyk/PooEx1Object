public class TestCity {

			private static final String COUNTRY = "France";
			
	public static void main(String[] args) {


		City toulouse = new City("Toulouse", COUNTRY, 450000);
		City bordeaux = new City("Bordeaux", COUNTRY, 275292);
		City saintGeoursDeMaremnes = new City("Saint Geours de Maremnes", COUNTRY, 3317);
		
//		System.out.println(toulouse);
//		System.out.println(bordeaux);
//		System.out.println(saintGeoursDeMaremnes);
		
		toulouse.numberOfInhabitants = toulouse.numberOfInhabitants + 20000; // avec l'attribut numberOfInhabitants dans la classe City en public
		System.out.println(toulouse);

	}
}
