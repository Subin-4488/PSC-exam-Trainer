package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class LoginController implements Initializable {

    @FXML
    private Button adminbtn;

    @FXML
    private Button loginbtn;

    @FXML
    private Pane loginpane;

    @FXML
    private TextField passtxt;

    @FXML
    private Button signupbtn;

    @FXML
    private Button userbtn;

    @FXML
    private TextField usertxt;
    
    private static String person="";

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    void adminButtonAction(ActionEvent event) {
		adminbtn.setStyle("-fx-background-color: red;");
		userbtn.setStyle("-fx-background-color: white;");
		LoginController.person="admin";
    }

    @FXML
    void loginButtonAction(ActionEvent event) {

    }

    @FXML
    void signupButtonAction(ActionEvent event) {

    }

    @FXML
    void userButtonAction(ActionEvent event) {
    	adminbtn.setStyle("-fx-background-color: white;");
		userbtn.setStyle("-fx-background-color: red;");
		LoginController.person="user";
    }


}
