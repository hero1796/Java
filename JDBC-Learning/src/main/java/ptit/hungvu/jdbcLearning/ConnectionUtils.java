package ptit.hungvu.jdbcLearning;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

	public ConnectionUtils() {

	}
	public static Connection getMyConnection() throws SQLException {
	 	Connection conn = SQLServerConnUtils_JTDS.getSQLServerConnection();
	 	return conn;
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println("get connection");
		Connection conn = ConnectionUtils.getMyConnection();
		System.out.println("Get connection " + conn + " done!");
	}
}
