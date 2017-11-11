package model;

import java.util.Date;

public class Employee extends Person {
	private int id;
	private float salary;
	private int expInYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public Employee(FullName name, Address address, Date dob, String phone, int id, float salary, int expInYear) {
		super(name, address, dob, phone);
		this.id = id;
		this.salary = salary;
		this.expInYear = expInYear;
	}

	public Employee(FullName name, Address address, Date dob, String phone, float salary, int expInYear) {
		super(name, address, dob, phone);
		this.salary = salary;
		this.expInYear = expInYear;
	}

}
