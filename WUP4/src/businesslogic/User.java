package businesslogic;

import java.util.*;

import dao.AbstractDAOFactory;
import dao.DAO;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User(String login, String pwd) {
    	this.login=login;
    	this.pwd=pwd;
    }

    /**
     * 
     */
    public String login;

    /**
     * 
     */
    public String pwd;


    public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	/**
     * @param login 
     * @param pwd 
     * @return
     */
    public static boolean log_in(String login, String pwd) {
    	boolean canLogIn = false;
        User user=new User(login,pwd);
        System.out.println("1");
        AbstractDAOFactory adf=AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
        System.out.println("2");
        DAO<User> DAOuser = adf.getUserDAO();
        System.out.println("3");
        canLogIn=DAOuser.exist(user);
        System.out.println("4");
        
        return canLogIn;
    }

}