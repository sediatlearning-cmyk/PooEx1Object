package fr.fms.entities;

public class Commercial extends Person{
	
	private Employee employee;
	private double percentCA;
	
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
		this.percentCA = ca;
		if(ca < 0) {
			this.percentCA = MIN_CA;
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
		return percentCA;
	}

	/**
	 * @param ca the ca to set
	 */
	public void setCa(double ca) {
		if (ca < 0) {
			this.percentCA = ca;
			throw new RuntimeException("% du chiffre d'affaire inférieur à 0 impossible.");	
		}
		else {
			this.percentCA = ca;
		}
	}
	@Override
	public  double getRemuneration(double CA) {
		double remuneration = (CA * (percentCA /100));
		return remuneration;
	}
	
//	@Override
//	public String toString() {
//		return getLastName() + ", " + getFirstName() + ", " + getAge()+ " ans, habitant " + getAddress() 
//		+ ", ville de naissance : " + getHometown().getCityName() + ", " 
//		+ getHometown().getCountry() + ", " + getHometown().getNumberOfInhabitants() 
//		+ " habitants, Entreprise : " + getEmployee().getCompany() + "% CA : " + percentCA ;
//	}
	
//	@Override
//	public String toString() {
//		return getLastName() + ", " + getFirstName() + ", " + getAge()+ " ans, habitant " + getAddress() 
//		+ ", ville de naissance : " + getHometown().getCityName() + ", " 
//		+ getHometown().getCountry() + " , Entreprise : " + getEmployee().getCompany() + ", " + "% CA : " + percentCA ;
//	}

}
