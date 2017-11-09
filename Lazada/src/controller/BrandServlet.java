package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

/**
 * Servlet implementation class BrandServlet
 */
@WebServlet("/category/*")
public class BrandServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public BrandServlet() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ProductDao pdao;
    try {
      pdao = new ProductDao();
      String brand = request.getPathInfo().substring(1);
      List<Product> products = null;
      switch (brand) {
      case "tv":
        products = pdao.getTivi();
        break;
      case "phone":
        products = pdao.getDienthoai();
        break;
      case "laptop":
        products = pdao.getlaptop();
        break;
      case "washing":
        products = pdao.getMaygiat();
        break;
      case "fridge":
        products = pdao.getTulanh();
        break;
      default:
        break;
      }
      request.setAttribute("products", products);
      request.getRequestDispatcher("/index.jsp").forward(request, response);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}
