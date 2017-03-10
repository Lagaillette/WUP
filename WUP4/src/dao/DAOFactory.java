package dao;
import java.util.*;

import businesslogic.User;
import connexion.Connect;

import java.sql.Connection;

/**
 * 
 */
public class DAOFactory extends AbstractDAOFactory {
	
	public static final Connection connect = Connect.getInstance();
	
	/*public DAOFactory(){
		System.out.println("DAOFactory1");
		DAOFactory.connect=(Connection) Connect.getInstance();
		System.out.println("DAOFactory2");
	}
	*/
 
    
    public DAO<User> getUserDAO(){
    	System.out.println("UserDAO");
		return new UserDAO(connect);
		
	}

}