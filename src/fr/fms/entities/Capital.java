package fr.fms.entities;



public class Capital extends City{

	private String monument;
	
	/**
	 * @param cityName
	 * @param country
	 * @param numberOfInhabitants
	 * @param monument
	 */
	public Capital(String cityName, String country, int numberOfInhabitants, String monument) {
		super(cityName, country, numberOfInhabitants);
		this.monument = monument;
	}

	public String getMonument() {
		return monument;
	}
	@Override
	public String toString() {
		return getCityName() +", " + getCountry() +", " + getNumberOfInhabitants() + " habitants, Monument : " + monument;
	}
	
} 
