package application;
	


import java.util.Iterator;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main8 extends Application {
	int num = 1;
	@Override
	public void start(Stage primaryStage) {
		try {
			//fxml layout loader
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("main8.fxml"));
			
			//window root
			AnchorPane mainLayoutAnchorPane = (AnchorPane) loader.load();
			Scene scene = new Scene(mainLayoutAnchorPane);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			TextField inputDan = (TextField) scene.lookup("#inputDan");
			TextArea dan = (TextArea) scene.lookup("#dan");
	
			Button btn = (Button) scene.lookup("#btn");
			
			btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					int a = Integer.parseInt(inputDan.getText());
					
					
					String result = "";
					for (int i = 1; i < 10; i++) {
						result += (a + "*" + i + "=" + (a * i) + "\n");
					}
					dan.setText(result + "");
					
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
