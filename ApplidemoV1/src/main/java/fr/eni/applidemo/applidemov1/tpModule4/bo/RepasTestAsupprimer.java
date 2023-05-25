package fr.eni.applidemo.applidemov1.tpModule4.bo;

import java.time.LocalDate;
import java.time.LocalTime;

import fr.eni.applidemo.applidemov1.tpModule4.dal.RepasDAOJdbcImpl;

public class RepasTestAsupprimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Repas miam = new Repas(LocalDate.of(2023, 5, 22), LocalTime.of(11,0), "pizza, coca, tiramisu, café");
		
		RepasDAOJdbcImpl testDaoJdbcImpl = new RepasDAOJdbcImpl();
		//testDaoJdbcImpl.connectToMySQLDB();
		//testDaoJdbcImpl.insert(miam);
		
		testDaoJdbcImpl.selectAll();
		
		

	}

}
