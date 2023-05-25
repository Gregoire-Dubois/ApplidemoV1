package fr.eni.applidemo.applidemov1.module6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.applidemo.applidemov1.module6.bo.Voiture;

/**
 * Servlet implementation class ServletBaliseJSTL
 */
@WebServlet("/modules/module5/ServletBaliseJSTL")
public class ServletBaliseJSTL extends HttpServlet {
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
		
		List<Voiture> voitures = new ArrayList<>();
		voitures.add(new Voiture("AUDI", "RS6", "AZ345SQ", 56789)); 
		voitures.add(new Voiture("PEUGEOT", "208", "QS876OP", 8734)); 
		voitures.add(new Voiture("MERCEDES", "classe A", "DF234BN", 1235)); 

		request.setAttribute("voitures", voitures);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/modules/module6/pageBaliseJSTL.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
