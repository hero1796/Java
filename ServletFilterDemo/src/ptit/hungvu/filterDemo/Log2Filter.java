package ptit.hungvu.filterDemo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Log2Filter implements Filter {
	private String logFile;
	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {
		this.logFile = paramFilterConfig.getInitParameter("logFilter");
		System.out.println("Log2 file = " + logFile);
	}

	@Override
	public void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse,
			FilterChain paramFilterChain) throws IOException, ServletException {
		if(this.logFile != null) {
			logToFile(this.logFile);
		}
		paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
	}

	@Override
	public void destroy() {
		System.out.println("filter2 Destroy");
	}

	public void logToFile(String fileName) {
		System.out.println("Writed log2 to file " + fileName);
	}
}
