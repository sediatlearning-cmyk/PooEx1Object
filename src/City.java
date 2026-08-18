
public class City {

	private String cityName;
	private String country;
	private int numberOfInhabitants;
	
	/**
	 * @param cityName
	 * @param country
	 * @param numberOfInhabitants
	 * with input validation for the number of inhabitants 
	 */
	public City(String cityName, String country, int numberOfInhabitants) {
		super();
		this.cityName = cityName;
		this.country = country;
		this.numberOfInhabitants = numberOfInhabitants;
	}

}
