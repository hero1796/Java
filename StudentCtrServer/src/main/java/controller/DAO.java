package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import jdbcConnection.MySQLConnUtils;
import ptit.hungvu.model.Student;

public class DAO {
	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public DAO() {
		try {
			conn = MySQLConnUtils.getMySQLConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean addStudent(Student st) {
		System.out.println("start addstdent...");
		String sqlInsert = "INSERT INTO studentdb.tblStudent VALUES(?, ?, ?, ?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sqlInsert);
			ps.setInt(1, st.getId());
			ps.setString(2, st.getName());
			ps.setTimestamp(3, new Timestamp(st.getdOb().getTime()));
			ps.setString(4, st.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println("add xong!");
		return true;
	}
}
