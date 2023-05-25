package fr.eni.applidemo.applidemov1.module4.dal;

public abstract class DAOFactory {
	
	public static AvisDAO getAvisDAO()
	{
		return new AvisDAOJdbcImpl();
	}
}
