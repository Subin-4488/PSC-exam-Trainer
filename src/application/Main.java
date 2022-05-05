package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;


public class Main extends Application {
	protected static Stage mainStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			mainStage=primaryStage;
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/fxml/login.fxml"));
			Parent root=loader.load();
			Scene scene=new Scene(root);
			mainStage.setScene(scene);
			mainStage.setTitle("PSC Challenger");
			mainStage.setResizable(false);
			mainStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
