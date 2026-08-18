public class TestCity {

			private static final String COUNTRY = "France";
			
	public static void main(String[] args) {


		City toulouse = new City("Toulouse", COUNTRY, 450000);
		City bordeaux = new City("Bordeaux", COUNTRY, 275292);
		City saintGeoursDeMaremnes = new City("Saint Geours de Maremnes", COUNTRY, 3317);
		
		System.out.println(toulouse);
		System.out.println(bordeaux);
		System.out.println(saintGeoursDeMaremnes);
		

	}
}
