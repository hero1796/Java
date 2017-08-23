package ptit.hungvu.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ptit.hungvu.web.beans.Constants;
@WebServlet(
		urlPatterns = {"/redirectDemo"}
		)
public class RedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RedirectServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String redirect = req.getParameter("redirect");
		if("true".equals(redirect)) {
			System.out.println("redirect to showMe servlet");
			req.setAttribute(Constants.ATTRIBUTE_USER_NAME_KEY, "khong the setAttribute");
			resp.sendRedirect(req.getContextPath() + "/showMe");
			return;
		}
		ServletOutputStream out =  resp.getOutputStream();
		out.println("<h3>Text of RedirectDemoServlet</h3>");
        out.println("- servletPath=" + req.getServletPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	
}
