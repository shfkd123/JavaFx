package application;
	


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main3 extends Application {
	int num = 1;
	@Override
	public void start(Stage primaryStage) {
		try {
			//fxml layout loader
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("main3.fxml"));
			
			//window root
			AnchorPane mainLayoutAnchorPane = (AnchorPane) loader.load();
			Scene scene = new Scene(mainLayoutAnchorPane);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Label lbl = (Label) scene.lookup("#lbl");
			TextField tf1 = (TextField) scene.lookup("#tf1");
			TextField tf2 = (TextField) scene.lookup("#tf2");
			TextField tf3 = (TextField) scene.lookup("#tf3");
			Button btn = (Button) scene.lookup("#btn");
			btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					int a = Integer.parseInt(tf1.getText());
					int b = Integer.parseInt(tf2.getText());
					int sum = a + b;
					tf3.setText(sum + "");
							
				}
				
			});
			
			primaryStage.setTitle("first javaFx button show");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
