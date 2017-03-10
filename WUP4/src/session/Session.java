package session;

public class Session {

	String login;
	String pwd;

	public static Session session=null;

	private Session(String login, String pwd){
		this.login=login;
		this.pwd=pwd;
	}

	public static Session getSession(String login,String pwd){
		if (session == null){
			synchronized(Session.class) {
				if (Session.session == null) {
					Session.session = new Session(login,pwd);
				}
			}
		}
		
		return Session.session;


	}

	public static void eraseSession(){
		Session session=null;
	}

	public static boolean exist(){
		if(session==null)
			return false;
		else
			return true;
	}


}
