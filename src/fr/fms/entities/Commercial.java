package fr.fms.entities;

public class Commercial extends Person{
	
	private Employee employee;
	private double ca;
	
	private static final double MIN_CA = 3.5;

	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param hometown
	 * @param employee
	 * @param ca
	 */
	public Commercial(String lastName, String firstName, int age, String address, City hometown, Employee employee,
			double ca) {
		super(lastName, firstName, age, address, hometown);
		this.employee = employee;
		this.ca = ca;
		if(ca < 0) {
			this.ca = MIN_CA;
			System.out.println("% du chiffre d'affaire inférieur à 0 impossible.");
			}
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @return the ca
	 */
	public double getCa() {
		return ca;
	}

	/**
	 * @param ca the ca to set
	 */
	public void setCa(double ca) {
		if (ca < 0) {
			this.ca = ca;
			throw new RuntimeException("% du chiffre d'affaire inférieur à 0 impossible.");	
		}
		else {
			this.ca = ca;
		}
	}

	@Override
	public String toString() {
		return getLastName() + ", " + getFirstName() + ", " + getAge()+ " ans, habitant " + getAddress() 
		+ ", ville de naissance : " + getHometown().getCityName() + ", " 
		+ getHometown().getCountry() + ", " + getHometown().getNumberOfInhabitants() 
		+ " habitants, Entreprise : " + getEmployee().getCompany() + ", " + "% CA : " + ca ;
	}
}
