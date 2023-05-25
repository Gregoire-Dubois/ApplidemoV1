package fr.eni.applidemo.applidemov1.module6.bo;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUseBean
 */
@WebServlet("/modules/module6/ServletUseBean")
public class ServletUseBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random();
		if(random.nextBoolean()) {
			Voiture voiture = new Voiture("REANULT", "ZOE", "AA123BB", 5346);
			request.setAttribute("voiture", voiture);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/modules/module6/pageUseBean.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
