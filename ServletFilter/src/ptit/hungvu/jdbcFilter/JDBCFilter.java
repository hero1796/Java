package ptit.hungvu.jdbcFilter;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(
		urlPatterns = {"/*"}
)
public class JDBCFilter implements Filter {

	public JDBCFilter() {

	}

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		String servletPath = req.getServletPath();
		if (servletPath.contains("/specialPath1") || servletPath.contains("/specialPath2")) {
	           Connection conn = null;
	           try {
	               conn = ConnectionUtils.getConnection();
	               System.out.println("Get connection success");
	               conn.setAutoCommit(false);
	 
	               MyUtils.storeConnection(arg0, conn);
	 
	               arg2.doFilter(arg0, arg1);
	 
	               conn.commit();
	           } catch (Exception e) {
	               ConnectionUtils.rollbackQuietly(conn);
	               throw new ServletException();
	           } finally {
	               ConnectionUtils.closeQuietly(conn);
	           }
	       }
	       else {
	           arg2.doFilter(arg0, arg1);
	       }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
