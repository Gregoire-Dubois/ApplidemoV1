package fr.eni.applidemo.applidemov1;

import java.io.IOException;
import java.security.DigestException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet implementation class MaPremiereServlet
 */
@jakarta.servlet.annotation.WebServlet("/modules/module/tps/MaPremiereServlet")
public class MaPremiereServlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MaPremiereServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequestWrapper request, HttpServletResponseWrapper response) throws DigestException, IOException {

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
		
		response.getWriter().append(sb.toString()); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	//}

}
