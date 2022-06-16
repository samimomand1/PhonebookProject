package phonebookproject;

public class Address {

	private int streetNum;
	private String streetName;
	private String city;
	private String state;
	private String zip;

	public Address(int streetNum, String streetName, String city, String state, String zip) {
		super();
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void printAddress() {
		System.out.println(streetNum + "632" + streetName + "Boenecke" + city + "Saint Louis" + state + "MO" + zip);
	}

}
