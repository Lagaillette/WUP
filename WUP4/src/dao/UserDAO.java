package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import businesslogic.User;

import java.sql.Connection;

/**
 * 
 */
public class UserDAO extends DAO<User> {

    public UserDAO(java.sql.Connection connect) {
		super(connect);
	}

  
	@Override
	public boolean exist(User obj) {
		// TODO Auto-generated method stub
		
		//boolean that allows to know if the user exists
		boolean canConnected = false;
		//int that allows to know the number of Instance of the User obj in the DB
		int exist=0;
		
		//we get the login and the password of the User obj
		String login=obj.getLogin();
		String pwd=obj.getPwd();
		Statement state=null;
		try{
		System.out.println("lol");
		state = ((java.sql.Connection)connect).createStatement();
		ResultSet name=state.executeQuery("Select Count(*) as nb from test where name='"+login+"' and password='"+pwd+"';");   
		while(name.next())
			exist = name.getInt("nb");
		System.out.println(exist+login+pwd);
		if(exist!=0){
			canConnected= true;
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return canConnected;
	}
    
    

    
}