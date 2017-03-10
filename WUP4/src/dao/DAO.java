package dao;
import java.sql.Connection;

/**
 * 
 */
public abstract class DAO<T> {
	
	public static Connection connect;

    public DAO(Connection connect){
    	DAO.connect=connect;
    }

    /**
     * object which allows the connection to the servor
     */
    

    /**
     * @param obj 
     * @return a boolean : true if the user has the good login and the good password
     */
    public abstract boolean exist(T obj);

}