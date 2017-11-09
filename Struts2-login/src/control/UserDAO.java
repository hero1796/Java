package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAO {
	private Connection con = null;
	private ResultSet rs = null;

	private String hostName = "localhost";
	private String dbName = "studentdb";
	private String userName = "hero1796";
	private String password = "hungga123";
	private String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	private String dbClass = "com.mysql.jdbc.Driver";

	public UserDAO() {
		try {
			Class.forName(dbClass);
			con = DriverManager.getConnection(connectionURL, userName, password);
		} catch(SQLException ex) {
			ex.printStackTrace();
		} catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public boolean checkLogin(User user) {
		boolean result = false;
		try {
			String sql = "select * from tblAccount where username = ? and password = ?";
			PreparedStatement prs = con.prepareStatement(sql);
			prs.setString(1, user.getUsername());
			prs.setString(2, user.getPassword());
			rs = prs.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}
}