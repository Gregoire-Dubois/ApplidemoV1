package fr.eni.applidemo.applidemov1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class TPRechercheNombre
 * 
 * 
 */    
@WebServlet("/modules/module2/tps/TPRechercheNombre") //répertoire du fichier html appelé sans mettre son nom
public class TPRechercheNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected int nombre() {
		int max = 10; 
		Random randomNumber = new Random();
		int alea = randomNumber.nextInt(max);
		System.out.println(alea);
		
		
		
		return alea;
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// générateur de nombre aléatoire entre 0 et 10
		
		/*
		StringBuffer sb = new StringBuffer();
		
		int max = 10; 
		Random randomNumber = new Random();
		int alea = randomNumber.nextInt(max);
		System.out.println(alea);
		
		sb.append("nombre aléatoire ").append(alea);
		
		response.getWriter().append(sb);
		*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// générer le nombre aléatoire
		
		//int max = 10; 
		//Random randomNumber = new Random();
		//int alea = randomNumber.nextInt(max);
		//System.out.println(alea);
		
		
		int alea = nombre();
		PrintWriter pWriter = new PrintWriter(System.out);
		pWriter.write(alea);
		
		// retourner la saisie utilisaiteur
		
		StringBuffer sbSaisieUtilisateur = new StringBuffer();
		String saisie = request.getParameter("nombre");
		sbSaisieUtilisateur.append("Le numéro est" ).append(saisie);
		response.getWriter().append(sbSaisieUtilisateur);
		
		// convertir saisie utilisateur en entier
		
		int nombreUser = Integer.parseInt(saisie); 
		
		// Vérification de la concordande entre le nombre saisi par l'utilisateur et le nombre aléatoire
		
		if(alea == nombreUser) {
			System.out.println("bravo");
			response.sendRedirect("/ApplidemoV1/modules/module2/tps/victoire.html");

			
		}else {
			System.out.println("pas de chance");
			response.sendRedirect("/ApplidemoV1/modules/module2/tps/perdu.html");
			
		}
	
	}

}
