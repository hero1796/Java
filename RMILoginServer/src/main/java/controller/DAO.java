package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class DAO {
	private Connection conn = null;
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public DAO() {
		conn = getMySQLConnection();
	}
	
	public static Connection getMySQLConnection(){
		String hostName = "localhost";
		String dbName = "studentdb";
		String userName = "hero1796";
		String password = "hungga123";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connectionURL, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public boolean checkLogin(User user) {
		String sql = "select * from tblAccount where username = ? and password = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
