package model;

import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private float price;
	private ArrayList<Category> listCategory;
	private ArrayList<Author> listAuthor;
	private Publisher publisher;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ArrayList<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(ArrayList<Category> listCategory) {
		this.listCategory = listCategory;
	}

	public ArrayList<Author> getListAuthor() {
		return listAuthor;
	}

	public void setListAuthor(ArrayList<Author> listAuthor) {
		this.listAuthor = listAuthor;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Book(int id, String name, float price, Publisher publisher) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}

	public Book(String name, float price, Publisher publisher) {
		super();
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}
	
	
}
