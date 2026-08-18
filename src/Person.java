
public class Person {

	private String lastName;
	private String firstName;
	private int age;
	private String address;
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param address
	 */
	public Person(String lastName, String firstName, int age, String address) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
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

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address="
				+ address + "]";
	}
	

}
