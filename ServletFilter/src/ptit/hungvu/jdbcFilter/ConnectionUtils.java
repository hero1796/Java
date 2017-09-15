package ptit.hungvu.jdbcFilter;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

	public ConnectionUtils() {

	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = OracleConnUtils.getOracleConnection();
		return conn;
	}
	
	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
