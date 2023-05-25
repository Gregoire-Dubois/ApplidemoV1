package fr.eni.applidemo.applidemov1.tpModule4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.applidemo.applidemov1.tpModule4.bo.Repas;
import fr.eni.applidemo.applidemov1.tpModule4.dal.RepasDAOJdbcImpl;

/**
 * Servlet implementation class ServletAjoutRepas
 */
@WebServlet("/ServletAjoutRepas")
public class ServletAjoutRepas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("/WEB-INF/modules/module4/tps/JSPAjout.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Conversion des request qui sont des chaines de caractères vers des objets java 
		String time = request.getParameter("time");
		String date = request.getParameter("date");
		String aliments = request.getParameter("aliments");
		
		// passage des objets java vers le costructeur de repas
		Repas miam = new Repas(LocalDate.parse(date), LocalTime.parse(time), aliments);
		
		// insertion dans la base de données 
		RepasDAOJdbcImpl testDaoJdbcImpl = new RepasDAOJdbcImpl();
		testDaoJdbcImpl.insert(miam);
		
		doGet(request, response);
	}

}
