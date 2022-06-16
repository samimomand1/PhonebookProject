package phonebookproject;

public class person {

	private long personNum;
	private String FirstName;
	private String lastName;
	private Address Address;

	public person() {

	}

	public person(long personNum, String firstName, String lastName) {
		super();
		this.personNum = personNum;
		FirstName = firstName;
		this.lastName = lastName;
	}

	public void addAddress(int streetNum, String streetName, String city, String state, String string) {
		Address temp = new Address(streetNum, streetName, city, state, string);
		Address = temp;
	}

	public Address getAddress() {
		return this.Address;
	}

	public long getPersonNum() {
		return personNum;
	}

	public void setPersonNum(long personNum) {
		this.personNum = personNum;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public void getperson() {
		System.out.println(FirstName + " " + lastName + " ");
		Address.printAddress();
		// sysout("phone Number" + "formatPhone(phoneum));
	}

	public void addAddress1(int streetNum, String streetName, String city, String state, String string) {

	}
}
