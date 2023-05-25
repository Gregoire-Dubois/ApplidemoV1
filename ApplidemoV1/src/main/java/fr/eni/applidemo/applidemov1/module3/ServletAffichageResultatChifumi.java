package fr.eni.applidemo.applidemov1.module3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAffichageResultatChifumi
 */
@WebServlet("/ServletAffichageResultatChifumi")
public class ServletAffichageResultatChifumi extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
			
	
	protected String[] choixAttaques() {
        String[] combinaisons = {"Pierre", "feuille", "ciseaux"};

		return combinaisons;
		
	}
	
	// fonction pour faire jouer le bot
	
	protected int choiceBot() {
		
		Random nombreRandom = new Random();
        int nombreAlea = nombreRandom.nextInt(3);
        return nombreAlea;
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] tableauArmes = choixAttaques();

		// Récupérer le choix de l'utilisateur 
		
		int choixJoueur = Integer.parseInt(request.getParameter("choixUnique").toString());
		System.out.println("Le joueur a joué " +tableauArmes[choixJoueur]);
		
		// Récupérer le choix du bot 

		int choixBot = choiceBot();
		System.out.println("Le bot a joué " +tableauArmes[choixBot]);
				
		
		// Déterminer qui gagne 
		

		int botGagne=0;
		int joueurGagne=0;
		int egalite =0;
		
		
	    if (choixBot == 0 && choixJoueur == 0){
	    	System.out.println("égalité");
	    	egalite = 1;


	    }
        
	    if (choixBot == 1 && choixJoueur == 0){
        	System.out.println("Le bot gagne avec la feuille");
        	botGagne = 1;

	    }
        
        if (choixBot == 2 && choixJoueur == 0){
        	System.out.println("le joueur gagne avec ciseaux");
        	joueurGagne = 1;
        }

        if (choixBot == 0 && choixJoueur == 1){
        	System.out.println("le joueur gagne avec la feuille gagne");
        	joueurGagne = 1;
        	
        }
        
        if (choixBot == 1 && choixJoueur == 1){
        	System.out.println("égalité");
        	egalite = 1;
        }
        
        if (choixBot == 2 && choixJoueur == 1){
        	System.out.println("Le bot gagne avec les ciseaux");
        	botGagne = 1;
        }

        if (choixBot == 0 && choixJoueur == 2){
        	System.out.println("Le bot gagne avec la pierre");
        	botGagne = 1; 
        }
        
        if (choixBot == 1 && choixJoueur == 2){
        	System.out.println("Le joueur gagne avec les ciseaux gagnent");
        	joueurGagne=1;
        }
        
        if (choixBot == 2 && choixJoueur == 2){
        	System.out.println("égalité");
        	egalite = 1;
        }
        
       
        // désignation du vainqueur
        
        String vainqueur=""; 
        if(botGagne == 1) {
        	vainqueur = "Le bot";

        }
        
        if (joueurGagne == 1) {
        	vainqueur = "le joueur";

		}
        
        if(egalite == 1) {
        	vainqueur = "Egalité entre les joueurs";

        }
		
		/*
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("WEB-INF/modules/module3/tps/JSPResultat.jsp");
		rd.forward(request, response);
		*/
        request.setAttribute("vainqueur", vainqueur);
        request.setAttribute("attaqueBot", tableauArmes[choixBot]);
        request.setAttribute("attaqueJoueur", tableauArmes[choixJoueur]);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/modules/module3/tps/JSPResultat.jsp");
		rd.forward(request, response);
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /*
		String[] tableauArmes = choixAttaques();

		// Récupérer le choix de l'utilisateur 
		
		int choixJoueur = Integer.parseInt(request.getParameter("choixUnique").toString());
		System.out.println("Le joueur a joué " +tableauArmes[choixJoueur]);
		
		// Récupérer le choix du bot 

		int choixBot = choiceBot();
		System.out.println("Le bot a joué " +tableauArmes[choixBot]);
				
		
		// Déterminer qui gagne 
		
		
	    if (choixBot == 0 && choixJoueur == 0){System.out.println("égalité");}
        if (choixBot == 1 && choixJoueur == 0){System.out.println("Le bot gagne avec la feuille");}
        if (choixBot == 2 && choixJoueur == 0){System.out.println("le joueur gagne avec ciseaux");}

        if (choixBot == 0 && choixJoueur == 1){System.out.println("le joueur gagne avec la feuille gagne");}
        if (choixBot == 1 && choixJoueur == 1){System.out.println("égalité");}
        if (choixBot == 2 && choixJoueur == 1){System.out.println("Le bot gagne avec les ciseaux");}

        if (choixBot == 0 && choixJoueur == 2){System.out.println("Le bot gagne avec la pierre");}
        if (choixBot == 1 && choixJoueur == 2){System.out.println("Le joueur gagne avec les ciseaux gagnent");}
        if (choixBot == 2 && choixJoueur == 2){System.out.println("égalité");}
		*/
		// dire qui a gagné 
		
		doGet(request, response);
	}

}
