package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import animation.TranslateAnimation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import others.Load;

public class LoginController implements Initializable {

	@FXML
    private Button adminbtn;

    @FXML
    private Button loginbtn;

    @FXML
    private Pane mainpane;

    @FXML
    private TextField passtxt;

    @FXML
    private Button signupbtn;

    @FXML
    private Button userbtn;

    @FXML
    private TextField usertxt;

    @FXML
    private Pane wrappane;
    
    @FXML
    private TextField signupnametxt;

    @FXML
    private TextField signuppasstxt;

    @FXML
    private TextField signupusertxt;

    
    private static String person="";
    private static String name;
    private static String username;
    private static String password;
    private boolean flag=false;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    void adminButtonAction(ActionEvent event) {
		flag=false;
		adminbtn.setStyle("-fx-background-color: red; -fx-text-fill: white");
		userbtn.setStyle("-fx-background-color: white; -fx-text-fill: black");
		LoginController.person="ADMIN";
	
		mainpane.getChildren().clear();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/fxml/loginpane.fxml"));
		loader.setController(this);
		try {
			mainpane.getChildren().add(loader.load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginbtn.setVisible(true);
		
		if (loginValidate()) {
			
		}
		else {
			
		}
		
		//database
    }
	
	@FXML
    void userButtonAction(ActionEvent event) {
		flag=false;
		userbtn.setStyle("-fx-background-color: red; -fx-text-fill: white");
		adminbtn.setStyle("-fx-background-color: white; -fx-text-fill: black");
		LoginController.person="USER";
		
		mainpane.getChildren().clear();
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/fxml/loginpane.fxml"));
		loader.setController(this);
		try {
			mainpane.getChildren().add(loader.load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginbtn.setVisible(true);
    }
	
	private boolean loginValidate() {
		LoginController.username=usertxt.getText(); 
		LoginController.password=passtxt.getText();
		
		if (username.length()>0 && password.length()>0)
			return true;
		else
			return false;
		
		//database
	}
	
	private boolean signupValidate() {
		System.out.println(LoginController.name+"  "+ LoginController.username+"  "+ LoginController.password);
			
		if (LoginController.name.length()>0 && LoginController.username.length()>0 && LoginController.password.length()>0)
			return true;
		else
			return false;
	}

    @FXML
    void loginButtonAction(ActionEvent event) {
    	if (loginValidate()) {
			
		}
		else {
			if (usertxt.getText().length()<=0)
				new TranslateAnimation(usertxt);
			if (passtxt.getText().length()<=0)
				new TranslateAnimation(passtxt);
		}
    }

    @FXML
    void signupButtonAction(ActionEvent event) { 	
    	if (!flag) {
    		loginbtn.setVisible(false);
        	
        	mainpane.getChildren().clear();
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/fxml/Signuppane.fxml"));
    		loader.setController(this);
    		try {
    			mainpane.getChildren().add(loader.load());
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		flag=true;
    	}
    	
    	LoginController.name=signupnametxt.getText();
		LoginController.username=signupusertxt.getText();
		LoginController.password=signuppasstxt.getText();
		
		//database
		if (signupValidate()) {
			
		}
		else {
			if (signupnametxt.getText().length()<=0)
				new TranslateAnimation(signupnametxt);
			if (signupusertxt.getText().length()<=0)
				new TranslateAnimation(signupusertxt);
			if (signuppasstxt.getText().length()<=0)
				new TranslateAnimation(signuppasstxt);
		}
    }
}
