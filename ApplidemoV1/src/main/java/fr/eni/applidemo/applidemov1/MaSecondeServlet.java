package fr.eni.applidemo.applidemov1;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaSecondeServlet
 */
@WebServlet("/MaSecondeServlet")
public class MaSecondeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MaSecondeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String protocole = request.getScheme();
		String nomServeurString  = request.getServerName();
		int port = request.getServerPort(); 
		String nomApplicationString = request.getContextPath();
		String cheminRessourceString = request.getServletPath();
		
		StringBuffer sb = new StringBuffer();
		sb.append("proto : ").append(protocole); 
		sb.append(" serveur ").append(nomServeurString); 
		sb.append(" port ").append(port); 
		sb.append(" nom application ").append(nomApplicationString);
		sb.append("chemin ressources").append(cheminRessourceString);
		
		
	

		
		response.getWriter().append(sb); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
