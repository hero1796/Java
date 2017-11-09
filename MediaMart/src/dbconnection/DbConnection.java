package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

  /**
   * Get connection.
   */
  public static Connection getConnection() throws ClassNotFoundException, SQLException {
    String url = "jdbc:sqlserver://localhost:1433;databaseName=JavaFinalTest;";
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, "sa", "hungga123");
    return conn;
  }

}
