package fr.fms.entities;

public class Employee extends Person {

	private Capital capital;
	private String company;
	private double salary;
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 * @param hometown
	 * @param capital
	 * @param company
	 * @param salary  
	 */
	public Employee(String lastName, String firstName, int age, String address, City hometown, Capital capital, String company,
			double salary) {
		super(lastName, firstName, age, address, hometown);
		this.capital = capital;
		this.company = company;
		this.salary = salary;
	}
	
	/**
	 * @return the capital
	 */
	public Capital getCapital() {
		return capital;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
	@Override
	public  double getRemuneration(double CA) {
		double remuneration = (salary -((salary * 20)/100));
		return remuneration;	
	}
	
//	@Override
//	public String toString() {
//		if(getCapital().getMonument()== null) {
//			return getLastName() + ", " + getFirstName() + ", " + getAge() + " ans, habitant " + getAddress() 
//			+ ", ville de naissance : " + getHometown().getCityName() + ", " + getHometown().getCountry() + ", "
//					+ getHometown().getNumberOfInhabitants() + " habitants, " + "Entreprise : " + company 
//					+ ", salaire : " + salary;
//		}
//		return getLastName() + ", " + getFirstName() + ", " + getAge() + " ans, habitant " + getAddress() 
//		+ ", ville de naissance : " + getHometown().getCityName() + ", " + getHometown().getCountry() + ", " 
//		+ getHometown().getNumberOfInhabitants() + " habitants, monument : " + getCapital().getMonument() + ", " 
//		+ "Entreprise : " + company + ", salaire : " + salary;
//	}
	
//	@Override
//	public String toString() {
//		if(getCapital().getMonument()== null) {
//			return getLastName() + ", " + getFirstName() + ", " + getAge() + " ans, habitant " + getAddress() 
//			+ ", ville de naissance : " + getHometown().getCityName() + ", " + getHometown().getCountry() + ", "
//					+ "Entreprise : " + company + ", salaire : " + salary;
//		}
//		return getLastName() + ", " + getFirstName() + ", " + getAge() + " ans, habitant " + getAddress() 
//		+ ", ville de naissance : " + getHometown().getCityName() + ", " + getHometown().getCountry() + ", Monument : " 
//		+ getCapital().getMonument() + ", " + "Entreprise : " + company + ", salaire : " + salary;
//	}
	
}
