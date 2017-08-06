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
		urlPatterns = {"/login"}
		)
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		UserInfo loginInfo = new UserInfo("Hung", "VN", 5);
		session.setAttribute(Constants.SESSION_USER_KEY, loginInfo);
		ServletOutputStream out = resp.getOutputStream();
		out.println("<html>");
	       out.println("<head><title>Session example</title></head>");
	       out.println("<body>");
	       out.println("<h3>Login success!</h3>");
	       out.println("<a href = " + "userInfo"+ ">Xem your info</a>");
	       out.println("</body>");
	       out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	
}
