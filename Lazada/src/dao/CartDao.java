package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DBCon.DBConnect;
import model.Cart;
import model.Product;

public class CartDao {
  Connection conn;
  Statement statement;
  PreparedStatement preStatement;
  ResultSet rs;

  public CartDao() throws ClassNotFoundException, SQLException {
    conn = DBConnect.getConnection();
    statement = conn.createStatement();
  }

  public ArrayList<Cart> getCart() {
    ArrayList<Cart> listCart = new ArrayList<Cart>();
    try {
      String sql = "Select * FROM cart";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Cart cart = new Cart(rs.getInt(1), rs.getInt(2), rs.getInt(3));
        listCart.add(cart);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listCart;
  }
  
  public int updateCart(int id, int idProduct, int number){
    int row = 0;
    String sql = "UPDATE cart SET idproduct= ?, number=? WHERE id=?";
    try {
      preStatement = conn.prepareStatement(sql);
      preStatement.setInt(1, idProduct);
      preStatement.setInt(2, number);
      preStatement.setInt(3, id);

      row = preStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return row;
  }
  
  public int deleteCart(int id) throws SQLException {
    String sql = "DELETE FROM cart WHERE id=" + id;
    preStatement = conn.prepareStatement(sql);
    int row = preStatement.executeUpdate();
    return row;
  }
  
  public int insertCart(Cart c) {
    int row = 0;
    String sql = "INSERT INTO cart "
        + "VALUES (?,?)";
    try {
      preStatement = conn.prepareStatement(sql);
      preStatement.setInt(1, c.getIdProduct());
      preStatement.setInt(2, c.getNumber());

      row = preStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return row;
  }
  
  public int deleteAll() {
    int row=0;
    String sql= "DELETE FROM cart";
    try {
      preStatement= conn.prepareStatement(sql);
      row= preStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return row;
  }
}
