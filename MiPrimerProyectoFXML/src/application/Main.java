package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
		 GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/fxml/Calculadora.fxml"));
         Scene scene = new Scene(root,400,400);
         scene.getStylesheets().add(getClass() .getResource("/css/application.css").toExternalForm());
         primaryStage.setTitle("CALCULADORA");
         primaryStage.setScene(scene);
         primaryStage.show();
		} catch(Exception e) {
         e.printStackTrace();
		}
 }

}
// its works!