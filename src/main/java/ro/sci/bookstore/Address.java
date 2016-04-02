package ro.sci.bookstore;

public class Address {
	private String addressStreet;
	private String addressNumber;
	private String addressCity;

	public Address(String addressStreet, String addressNumber, String addressCity) {
		this.addressStreet = addressStreet;
		this.addressNumber = addressNumber;
		this.addressCity = addressCity;
	}

	public Address() {

	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
}
