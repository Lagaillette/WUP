package facade;

import java.util.*;

import businesslogic.User;

/**
 * 
 */
public class Facade {

    /**
     * Default constructor
     */
    public Facade() {
    }


    /**
     * @param login 
     * @param pwd 
     * @return
     */
    public static boolean log_in(String login, String pwd) {
        return User.log_in(login,pwd);
    }

}