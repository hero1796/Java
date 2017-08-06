package ptit.hungvu.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ptit.hungvu.web.beans.Constants;;
@WebServlet(
		urlPatterns = {"/forwardDemo"}
)
public class ForwardServletDemo extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ForwardServletDemo() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forward = req.getParameter("forward");
		if("true".equals(forward)) {
			System.out.println("Forward to ShowMeServlet");
	        req.setAttribute(Constants.ATTRIBUTE_USER_NAME_KEY,
	                "Hi, I'm Tom come from Walt Disney !");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/showMe");
	        dispatcher.forward(req, resp);
	        return;
		}
		ServletOutputStream out = resp.getOutputStream();
	    out.println("<h3>Text of ForwardDemoServlet</h3>");
	    out.println("- servletPath=" + req.getServletPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
