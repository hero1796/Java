package model;

public class Address {
	private String homeNumber;
	private String street;
	private String city;
	private String country;
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [homeNumber=" + homeNumber + ", street=" + street + ", city=" + city + ", country=" + country
				+ "]";
	}
	public Address(String homeNumber, String street, String city, String country) {
		super();
		this.homeNumber = homeNumber;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
}
