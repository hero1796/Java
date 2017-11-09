package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DBCon.DBConnect;
import model.Category;

public class CategoryDao {
  Connection conn;
  Statement statement;
  PreparedStatement preStatement;
  ResultSet rs;
  public CategoryDao() throws ClassNotFoundException, SQLException {
    conn = DBConnect.getConnection();
    statement = conn.createStatement();
  }
  
  public Category getCategoryById(int id) {
    Category cat= new Category();
    try {
      String sql = "Select * FROM category WHERE id=" + id;
      rs = statement.executeQuery(sql);
      rs.next();
      String name= rs.getString(2);
      cat = new Category(id, name);
    } catch (Exception e) {
      // TODO: handle exception
    }
    return cat;
  }
  
  public ArrayList<Category> getCategory() {
    ArrayList<Category> listCategory = new ArrayList<Category>();
    try {
      String sql = "Select * FROM category";
      rs = statement.executeQuery(sql);
      while (rs.next()) {
        Category cat = new Category(rs.getInt(1), rs.getString(2));
        listCategory.add(cat);

      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return listCategory;
  }
}
