package fr.fms.entities;

public class Commercial extends Person{
	
	private Employee employee;
	private double ca;

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

	@Override
	public String toString() {
		return getLastName() + ", " + getFirstName() + ", " + getAge()+ " ans, habitant " + getAddress() 
		+ ", ville de naissance : " + getHometown().getCityName() + ", " 
		+ getHometown().getCountry() + ", " + getHometown().getNumberOfInhabitants() 
		+ " habitants, Entreprise : " + getEmployee().getCompany() + ", " + "% CA : " + ca ;
	}
}
