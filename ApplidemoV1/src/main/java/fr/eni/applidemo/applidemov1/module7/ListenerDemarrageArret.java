package fr.eni.applidemo.applidemov1.module7;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerDemarrageArret
 *
 */
@WebListener
public class ListenerDemarrageArret implements ServletContextListener {
	
	private static Date dateDemarrageDate; 
	
	public static Date getDateDemarrage() {
		return dateDemarrageDate;
	}

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Arrêt de l'application");
    
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Démarrage de l'application");
    
    	ListenerDemarrageArret.dateDemarrageDate=new Date();
    	
    }
	
}
