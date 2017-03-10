package connexion;


import java.sql.Connection;
import java.sql.DriverManager;

//CTRL + SHIFT + O pour g�n�rer les imports
public class Connect {

	public static Connection  connect;
	
	private static final String url = "jdbc:postgresql://localhost:5400/login";
	
	private static final String user = "postgres";
	
	private static final String passwd = "wup";
	
	public static Connection getInstance(){
		if (connect == null){
		try {
			//Class.forName("org.postgresql.Driver");
			System.out.println("Driver O.K.");

			
			connect= DriverManager.getConnection(url, user, passwd);
			System.out.println("afterConnection");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		System.out.println(connect);
		return connect; 
	}

	
}
