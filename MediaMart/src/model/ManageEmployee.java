package model;

import java.util.Date;

public class ManageEmployee extends Employee {

	public ManageEmployee(FullName name, Address address, Date dob, String phone, float salary, int expInYear) {
		super(name, address, dob, phone, salary, expInYear);
		// TODO Auto-generated constructor stub
	}

	public ManageEmployee(FullName name, Address address, Date dob, String phone, int id, float salary, int expInYear) {
		super(name, address, dob, phone, id, salary, expInYear);
		// TODO Auto-generated constructor stub
	}
}
