package ptit.hungvu.filterDemo;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

	public LogFilter() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("LogFilter init");
	}

	@Override
	public void destroy() {
		System.out.println("LogFilter destroy");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		String servletPath = req.getServletPath();
		System.out.println("#INFO: " + new Date() 
						+ "- ServletPath: " + servletPath + " - URL = " + req.getRequestURI());
		arg2.doFilter(arg0, arg1);	
	}

}
