package ptit.hungvu.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ptit.hungvu.web.beans.Constants;
import ptit.hungvu.web.beans.UserInfo;
@WebServlet(
		urlPatterns = {"/userInfo"}
)
public class UserInfoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserInfoServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
	       HttpSession session = req.getSession();
	       UserInfo loginedInfo = (UserInfo) session.getAttribute(Constants.SESSION_USER_KEY);
	       if (loginedInfo == null) {
	           resp.sendRedirect(this.getServletContext().getContextPath() + "/login");
	           return;
	       }
	       System.out.println(req.getContextPath());
	       out.println("<html>");
	       out.println("<head><title>Session example</title></head>");
	 
	       out.println("<body>");
	 
	       out.println("<h3>User Info:</h3>");
	 
	       out.println("<p>User Name:" + loginedInfo.getUserName() + "</p>");
	       out.println("<p>Country:" + loginedInfo.getCountry() + "</p>");
	       out.println("<p>Post:" + loginedInfo.getPost() + "</p>");
	 
	       out.println("</body>");
	       out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
