package dao;

import java.sql.Connection;

import businesslogic.User;

/**
 * 
 */
public abstract class AbstractDAOFactory {

    /**
     * Default constructor
     */
    public AbstractDAOFactory() {
    }

    
    public static final int DAO_FACTORY = 0;
    
    /**
     * @param connect 
     * @return
     */
    public abstract DAO<User> getUserDAO();
   
    public static AbstractDAOFactory getFactory(int type){
        switch(type){
          case DAO_FACTORY:
        	  System.out.println("Abstract");
            return new DAOFactory();
          default:
            return null;
        }
      }

}