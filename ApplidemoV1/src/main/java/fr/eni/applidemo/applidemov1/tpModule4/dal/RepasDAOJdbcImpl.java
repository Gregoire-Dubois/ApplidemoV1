package fr.eni.applidemo.applidemov1.tpModule4.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import fr.eni.applidemo.applidemov1.tpModule4.bo.Repas;

public class RepasDAOJdbcImpl {
	
	private static final String RQT_SELECT_ALL = "SELECT * FROM repas INNER JOIN aliments ON repasId = alimentsId;";
	
	private static final String RQT_REPAS = "INSERT INTO repas(dateRepas, heureRepas)"
			+ "VALUES (?,?); ";
	private static final String RQT_ALIMENT_STRING = "INSERT INTO aliments(nomsAliments)"
			+ "VALUES (?);"; 

	public RepasDAOJdbcImpl() {
			
	
	}
	
	public Connection connectToMySQLDB() {
		
		String url = "jdbc:mysql://localhost:3306/suiviDesRepas";
		String user = "root";
		String pass = "GregD2021$";
				
		Connection cnx = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnx = DriverManager.getConnection(url,user,pass);
			Statement stmt = cnx.createStatement();
			stmt.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnx;	
	}
	
	// insertion du repas dans la base de données
	public void insert(Repas repas) {

		//String url = "jdbc:mysql://localhost:3306/suiviDesRepas";
		//String user = "root";
		//String pass = "GregD2021$";
				
		Connection cnx = null;
		
		try {
			
			Context context = new InitialContext();
			
			// Recherche de la data source qui donne les connexions vers la base de données
			
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/pool_cnx_repas"); 
			
			// demander une connexion pour faire les traitements. la méthode getConnction met en attente tant qu'il n'y a pas de connexion disponible dans le pool
			cnx = dataSource.getConnection();
			
			// libérer la connexion lorsque l'on en a plus besoin
			
			//écriture dans la table repas
			PreparedStatement pstmtRepas =  cnx.prepareStatement(RQT_REPAS);
			pstmtRepas.setObject(1, repas.getDateRepasDate());
			pstmtRepas.setObject(2, repas.getHeureDuRepas());
			pstmtRepas.executeUpdate();
			
			//écriture dans la table aliments
			PreparedStatement pstmtAliments = cnx.prepareStatement(RQT_ALIMENT_STRING);
			pstmtAliments.setString(1, repas.getAliments());
			pstmtAliments.executeUpdate();
			
			pstmtRepas.close();
			pstmtAliments.close();
			cnx.close();
			
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public static void selectAll() {
		// afficher tous les repas par date du plus anciens au plus récent
		// attention, il y a 2 tables, il faudra faire un join des tables

		//String url = "jdbc:mysql://localhost:3306/suiviDesRepas";
		//String user = "root";
		//String pass = "GregD2021$";
				
		Connection cnx = null;
		
		String sortieString = "";
		
		try {
			
			Context context = new InitialContext();
			
			// Recherche de la data source qui donne les connexions vers la base de données
			
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/pool_cnx_repas"); 
			
			// demander une connexion pour faire les traitements. la méthode getConnction met en attente tant qu'il n'y a pas de connexion disponible dans le pool
			cnx = dataSource.getConnection();
			
			// libérer la connexion lorsque l'on en a plus besoin			
			
			
			PreparedStatement pstmtAll = cnx.prepareStatement(RQT_SELECT_ALL);
			ResultSet rst = pstmtAll.executeQuery();

			while (rst.next()) {
				System.out.println(rst.getString("dateRepas")+ " "+ rst.getString("heureRepas")+" " + rst.getString("nomsAliments"));
			
			}
			System.out.println(sortieString);
			
			
			pstmtAll.close();
			cnx.close();
			
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
