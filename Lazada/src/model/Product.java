package model;

public class Product {
  private int id;
  private String name;
  private String linkImg;
  private int price;
  private String maker;
  private int categoryID;

  public Product() {
    super();
  }

  public Product(int id, String name, String linkImg, int price, String maker, int categoryID) {
    super();
    this.id = id;
    this.name = name;
    this.linkImg = linkImg;
    this.price = price;
    this.maker = maker;
    this.categoryID = categoryID;
  }
  
  public Product(String name, String linkImg, int price, String maker, int categoryID) {
    super();
    this.name = name;
    this.linkImg = linkImg;
    this.price = price;
    this.maker = maker;
    this.categoryID = categoryID;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLinkImg() {
    return linkImg;
  }

  public void setLinkImg(String linkImg) {
    this.linkImg = linkImg;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public int getCategoryID() {
    return categoryID;
  }

  public void setCategoryID(int categoryID) {
    this.categoryID = categoryID;
  }

  public int getId() {
    return id;
  }
  public String toString() {
    return this.id+" "+this.name+" "+this.linkImg+" "+this.price+" "+this.maker+" "+this.categoryID;
  }
}
