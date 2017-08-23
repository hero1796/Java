package ptit.hungvu.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ptit.hungvu.web.beans.Constants;
@WebServlet(
		urlPatterns = {"/showMe"}
)
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
		System.out.println("Ham khoi tao showMe");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init ServletConfig showMe");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.println("<h1>Text of showMeServlet</h1>");
		out.println("<br><h2>"+ req.getAttribute(Constants.ATTRIBUTE_USER_NAME_KEY) + "</h2>");
		out.println("</body>");
		out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
