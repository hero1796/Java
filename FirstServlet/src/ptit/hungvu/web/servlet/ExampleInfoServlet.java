package ptit.hungvu.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.ServletContext;

@WebServlet(
		urlPatterns = {"/getinfoServlet"}
)

public class ExampleInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ExampleInfoServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		out.println("<style> span {color:blue;} </style>");

		String requestURL = req.getRequestURL().toString();
		out.println("<br><span>requestURL:</span>");
		out.println(requestURL);

		String requestURI = req.getRequestURI();
		out.println("<br><span>requestURI:</span>");
		out.println(requestURI);

		String contextPath = req.getContextPath();
		out.println("<br><span>contextPath:</span>");
		out.println(contextPath);

		out.println("<br><span>servletPath:</span>");
		String servletPath = req.getServletPath();
		out.println(servletPath);

		String queryString = req.getQueryString();
		out.println("<br><span>queryString:</span>");
		out.println(queryString);

		String param1 = req.getParameter("text1");
		out.println("<br><span>getParameter text1:</span>");
		out.println(param1);

		String param2 = req.getParameter("text2");
		out.println("<br><span>getParameter text2:</span>");
		out.println(param2);

		// Server Infos
		out.println("<br><br><b>Server info:</b>");

		out.println("<br><span>serverName:</span>");
		String serverName = req.getServerName();
		out.println(serverName);

		out.println("<br><span>serverPort:</span>");
		int serverPort = req.getServerPort();
		out.println(serverPort + "");

		// Client Infos
		out.println("<br><br><b>Client info:</b>");

		out.println("<br><span>remoteAddr:</span>");
		String remoteAddr = req.getRemoteAddr();
		out.println(remoteAddr);

		out.println("<br><span>remoteHost:</span>");
		String remoteHost = req.getRemoteHost();
		out.println(remoteHost);

		out.println("<br><span>remoteHost:</span>");
		int remotePort = req.getRemotePort();
		out.println(remotePort + "");

		out.println("<br><span>remoteUser:</span>");
		String remoteUser = req.getRemoteUser();
		out.println(remoteUser);

		// Header Infos
		out.println("<br><br><b>headers:</b>");

		Enumeration<String> headers = req.getHeaderNames();
		while (headers.hasMoreElements()) {
			String header = headers.nextElement();
			out.println("<br><span>" + header + "</span>: " + req.getHeader(header));
		}

		// Servlet Context info:
		out.println("<br><br><b>Servlet Context info:</b>");
		ServletContext servletContext = (ServletContext) req.getServletContext();

		// Location of web application in hard disk
		out.println("<br><span>realPath:</span>");
		String realPath = servletContext.getRealPath("");
		out.println(realPath);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
