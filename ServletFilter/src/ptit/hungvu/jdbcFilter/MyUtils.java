package ptit.hungvu.jdbcFilter;

import java.sql.Connection;

import javax.servlet.ServletRequest;

public class MyUtils {

	public MyUtils() {
		
	}

	public static final String ATT_CONN = "MY_CONNECTION_ATTRIBUTE";
	public static void storeConnection(ServletRequest req, Connection conn) {
		req.setAttribute(ATT_CONN, conn);
	}
	public static Connection getStoredConnection(ServletRequest req) {
		Connection conn = (Connection) req.getAttribute(ATT_CONN);
		return conn;
	}
}
