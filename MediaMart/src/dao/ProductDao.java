package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbconnection.DbConnection;
import model.Product;

public class ProductDao {
  Connection conn;
  Statement statement;
  PreparedStatement preStatement;
  ResultSet rs;

  public ProductDao() throws ClassNotFoundException, SQLException {
    conn = DbConnection.getConnection();
    statement = conn.createStatement();
  }

  public Product getProductById(int id) {
    Product p = new Product();
    try {
      String sql = "Select * FROM product1 WHERE id=" + id;
      rs = statement.executeQuery(sql);
      rs.next();
      String name = rs.getString(2);
      String linkImg = rs.getString(3);
      int price = rs.getInt(4);
      String maker = rs.getString(5);
      int categoryID = rs.getInt(6);

      p = new Product(id, name, linkImg, price, maker, categoryID);
    } catch (Exception e) {
      // TODO: handle exception
    }
    return p;
  }

  public ArrayList<Product> getProduct() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  
  public ArrayList<Product> getTivi() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where categoryID=1";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  public ArrayList<Product> getlaptop() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where categoryID=2";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  public ArrayList<Product> getDienthoai() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where categoryID=3";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  public ArrayList<Product> getTulanh() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where categoryID=4";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  public ArrayList<Product> getMaygiat() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where categoryID=5";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  public ArrayList<Product> getGiadung() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where categoryID=6";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
  public ArrayList<Product> getProduct1() {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }

  public int deleteProduct(int id) throws SQLException {
    String sql = "DELETE FROM product1 WHERE id=" + id;
    preStatement = conn.prepareStatement(sql);
    int row = preStatement.executeUpdate();
    return row;
  }

  public int editProduct(int id, String name, int price, String maker, int categoryID) {
    int row = 0;
    String sql = "UPDATE product1 SET name= ?, price=?, maker=?, categoryID=? WHERE id=?";
    try {
      preStatement = conn.prepareStatement(sql);
      preStatement.setString(1, name);
      preStatement.setInt(2, price);
      preStatement.setString(3, maker);
      preStatement.setInt(4, categoryID);
      preStatement.setInt(5, id);

      row = preStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return row;
  }

  public int insertProduct(Product p) {
    int row = 0;
    String sql = "INSERT INTO product1 "
        + "VALUES (?,?,?,?,?)";
    try {
      preStatement = conn.prepareStatement(sql);
      preStatement.setString(1, p.getName());
      preStatement.setString(2, p.getLinkImg());
      preStatement.setInt(3, p.getPrice());
      preStatement.setString(4, p.getMaker());
      preStatement.setInt(5, p.getCategoryID());

      row = preStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return row;
  }
  
  public ArrayList<Product> searchProduct(String name) {
    ArrayList<Product> listProduct= new ArrayList<Product>();
    try {
      String sql = "Select * FROM product1 where name LIKE '%"+name+"%'";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
            rs.getString(5), rs.getInt(6));
        listProduct.add(pro);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listProduct;
  }
}
