package model;

import java.util.Date;

public class Customer extends Person {
	private int id;
	private int isVip;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsVip() {
		return isVip;
	}

	public void setIsVip(int isVip) {
		this.isVip = isVip;
	}

	public Customer(FullName name, Address address, Date dob, String phone, int id, int isVip) {
		super(name, address, dob, phone);
		this.id = id;
		this.isVip = isVip;
	}

	public Customer(FullName name, Address address, Date dob, String phone, int isVip) {
		super(name, address, dob, phone);
		this.isVip = isVip;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", isVip=" + isVip + "]";
	}

}
