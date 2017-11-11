package model;

public class FullName {
	private String firstName;
	private String midName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName + "]";
	}
	public FullName(String firstName, String midName, String lastName) {
		super();
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
	}
	
}
