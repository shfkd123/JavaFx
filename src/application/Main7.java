package application;
	


import java.util.Iterator;

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


public class Main7 extends Application {
	int num = 1;
	@Override
	public void start(Stage primaryStage) {
		try {
			//fxml layout loader
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("main7.fxml"));
			
			//window root
			AnchorPane mainLayoutAnchorPane = (AnchorPane) loader.load();
			Scene scene = new Scene(mainLayoutAnchorPane);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			TextField tfMine = (TextField) scene.lookup("#tfMine");
			TextField tfCom = (TextField) scene.lookup("#tfCom");
			TextField tfResult = (TextField) scene.lookup("#tfResult");
			Button btn = (Button) scene.lookup("#btn");
			btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					double random = Math.random();
					if(random < 0.3) {
						tfCom.setText("가위");
					}else if(random < 0.6) {
						tfCom.setText("바위");
					}else
						tfCom.setText("보");
					String a = tfMine.getText();
					String b = tfCom.getText();
					
					if(a.equals(b)) {
						tfResult.setText("성공!");
					}else
						tfResult.setText("실패!");
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
