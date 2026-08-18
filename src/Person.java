
public class Person {

	private String lastName;
	private String firstName;
	private int age;
	private String address;
	private City hometown;
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 */
	public Person(String lastName, String firstName, int age, String address, City hometown) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.hometown = hometown;
	}
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 */
	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = "Unknown";
	}

	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = 0;
		this.address = "Unknown";
		
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	public City getHometown() {
		return hometown;
	}

//	@Override
//	public String toString() {
//		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address="
//				+ address +"] " + hometown;
//	}
	
	@Override
	public String toString() {
		return  lastName + ", " + firstName + ", " + age + " ans, habitant " + address
				+ ", Ville de naissance : " + hometown + "\n";
	}
}
