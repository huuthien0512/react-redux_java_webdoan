package com.example.backend.model;

public class ShippingAddress {
	private String email;
	private String firstname;
	private String lastname;
	private String telephone;;
	private String address;
	private String district;
	private String city;
	public ShippingAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShippingAddress(String email, String firstname, String lastname, String telephone, String address,
			String district, String city) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.address = address;
		this.district = district;
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
