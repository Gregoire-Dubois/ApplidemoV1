package fr.eni.applidemo.applidemov1.module3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDelegantReponseAUneJSP
 */
@WebServlet("/ServletDelegantReponseAUneJSP")
public class ServletDelegantReponseAUneJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// première méthode pour récupérer la JSP dans le WEB-INF 
		
		//RequestDispatcher rd = null;
		//rd = request.getRequestDispatcher("WEB-INF/modules/module3/demonstrations/premiereJSPDansWEB-INF.jsp");
		//rd.forward(request, response);
		//rd.forward(request, response);

		// Seconde méthode
		
		//RequestDispatcher rd = null;
		//rd = this.getServletContext().getRequestDispatcher("/WEB-INF/modules/module3/demonstrations/premiereJSPDansWEB-INF.jsp"); // en visant le web-inf
		//rd = this.getServletContext().getRequestDispatcher("/modules/module3/demonstrations/secondePremiereJSP"); // avec une url

		//rd.forward(request, response);

		
		// troisièeme manière de faire avec l'utilisation du nom défini au niveau de la balise ServletName
		RequestDispatcher rd = null;
		rd = this.getServletContext().getNamedDispatcher("premiereJSPDansWEB_INF");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
