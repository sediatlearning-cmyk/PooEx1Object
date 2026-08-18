
public class City {

	private String cityName;
	private String country;
	public int numberOfInhabitants;
	
	private static final int MIN_INHABITANTS = 1;

	
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
		if(numberOfInhabitants < 1) {
			this.numberOfInhabitants = MIN_INHABITANTS;
			System.out.println("Le nombre d'habitants ne peut pas être inférieur à 1.");
			}

	}
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumberOfInhabitants() {
		return numberOfInhabitants;
	}

	public void setNumberOfInhabitants(int numberOfInhabitants) {
		if (numberOfInhabitants < 1) {
			this.numberOfInhabitants = numberOfInhabitants;
			throw new RuntimeException("Le nombre d'habitants ne peut être inférieur à 1.");	
		}
		else {
			this.numberOfInhabitants = numberOfInhabitants;
		}

	}

}
