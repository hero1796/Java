package ptit.hungvu.filterDemo;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = { "*.png", "*.jpg", "*.gif" }, initParams = {
		@WebInitParam(name = "imageNotFound", value = "/images/image-not-found.png") })
public class ImageFilter implements Filter {
	private String imageNotFound;

	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {
		this.imageNotFound = paramFilterConfig.getInitParameter("imageNotFound");
	}

	@Override
	public void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse,
			FilterChain paramFilterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) paramServletRequest;
		String servletPath = req.getServletPath();
		String realRootPath = req.getServletContext().getRealPath("/");

		String imageRealPath = realRootPath + servletPath;

		System.out.println("imageRealPath = " + imageRealPath);
		File file = new File(imageRealPath);
		if (file.exists()) {
			paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
		} else if(!servletPath.equals(this.imageNotFound)) {
//			HttpServletResponse resp = (HttpServletResponse) paramServletResponse;
//			String redirectPath = realRootPath + this.imageNotFound;
//			resp.sendRedirect(redirectPath);
			req.getRequestDispatcher(this.imageNotFound).forward(paramServletRequest, paramServletResponse);
		}
	}

	@Override
	public void destroy() {

	}

	public ImageFilter() {

	}

}
