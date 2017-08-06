package ptit.hungvu.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String email1;
	public InitParamServlet() {
		super();
		System.out.println("Ham khoi tao 2");
	}
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init ServletConfig 2");
		this.email1 = config.getInitParameter("email1");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<title>Hoc jquery</title>");
		out.println("<script src=\"http://code.jquery.com/jquery-3.2.1.js\" type=\"text/javascript\"></script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href=\"\">Resetss</a> ");
		out.println("<script type=\"text/javascript\">\n" + 
				"       jQuery(document).ready(function(){\n" + 
				"           alert(\"Hello jQuery\");\n" + 
				"       });\n" + 
				"    </script>");
		out.println("<h1>Email1 = " + this.email1 + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	
}
