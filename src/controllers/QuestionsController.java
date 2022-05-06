package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class QuestionsController implements Initializable {

	@FXML
    private RadioButton optionradioa;

    @FXML
    private RadioButton optionradiob;

    @FXML
    private RadioButton optionradioc;

    @FXML
    private RadioButton optionradiod;

    @FXML
    private ToggleGroup optionsGroup;

    @FXML
    private AnchorPane questionpane;

    @FXML
    private TextArea questiontxtarea;

    @FXML
    private Button savebtn;

    @FXML
    private Label topiclabel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
