package ptit.hungvu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String masp = request.getParameter("masp");
		String tensp = request.getParameter("tensp");
		String nhacc = request.getParameter("nhacc");
		double giadv = Double.parseDouble(request.getParameter("giadv"));

		SanPham sp = new SanPham(masp, tensp, nhacc, giadv);
		ConnectDB db = new ConnectDB();
		try {
			if (db.UpdateProduct(masp, sp))
				response.sendRedirect("index.jsp");
			else
				response.sendRedirect("error.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
