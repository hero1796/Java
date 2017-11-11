package model;

public class Cart {
	private int id;
	private int idProduct;
	private int number = 1;

	public Cart() {
		super();
	}

	public Cart(int idProduct, int number) {
		super();
		this.idProduct = idProduct;
		this.number = number;
	}

	public Cart(int id, int idProduct, int number) {
		super();
		this.id = id;
		this.idProduct = idProduct;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
