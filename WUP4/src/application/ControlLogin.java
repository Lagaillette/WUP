package application;


import javax.swing.JOptionPane;

import facade.Facade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import session.Session;

public class ControlLogin {
	
    @FXML
    private Button btnCo;

    @FXML
    private TextField pass;

    @FXML
    private TextField login;
    
    @FXML
    public void clickbuton(ActionEvent event){
    	
    	String log = login.getText();
		String pwd= pass.getText();
		
    	if(log.length()!=0 && pwd.length()!=0){
    		
			if (Facade.log_in(log, pwd)){
				Session.getSession(log, pwd);
				JOptionPane.showMessageDialog(null, "Connection reussie!");
			}
			else{
				JOptionPane.showMessageDialog(null,"Login ou mot de passe incorrect");
			}
		}
		else{
			System.out.println("okkkk");
			JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs s'il vous plait");
		}
    	if(Session.exist()){
    		JOptionPane.showMessageDialog(null, "session effective!");
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "session non effective!");
    	}
	
    }
}
