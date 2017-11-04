package dk.topdanmark.pojo;

public class Customer {
	private String name;
	private String street_1;
	private String street_2;
	private Integer zipcode;
	private String city;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet_1() {
		return street_1;
	}
	public void setStreet_1(String street_1) {
		this.street_1 = street_1;
	}
	public String getStreet_2() {
		return street_2;
	}
	public void setStreet_2(String street_2) {
		this.street_2 = street_2;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
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
	
}
