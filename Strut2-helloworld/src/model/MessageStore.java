package model;

public class MessageStore {
	private String message;

	public MessageStore() {
		setMessage("Xin chao cac ban dang hoc Struts 2!");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}