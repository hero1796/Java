package model;

public class Author {
	private String name;
	private String dob;
	private String penName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public Author(String name, String dob, String penName) {
		super();
		this.name = name;
		this.dob = dob;
		this.penName = penName;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", dob=" + dob + ", penName=" + penName + "]";
	}

}
