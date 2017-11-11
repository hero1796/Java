package model;

import java.util.Date;

public class Person {
	private FullName name;
	private Address address;
	private java.util.Date dob;
	private String phone;

	public FullName getName() {
		return name;
	}

	public void setName(FullName name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public java.util.Date getDob() {
		return dob;
	}

	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person(FullName name, Address address, Date dob, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", dob=" + dob + ", phone=" + phone + "]";
	}

}
