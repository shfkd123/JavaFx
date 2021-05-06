package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main9 extends Application {
	int num = 1;

	@Override
	public void start(Stage primaryStage) {
		try {
			// fxml layout loader
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("main9.fxml"));

			// window root
			AnchorPane mainLayoutAnchorPane = (AnchorPane) loader.load();
			Scene scene = new Scene(mainLayoutAnchorPane);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			TextField input = (TextField) scene.lookup("#input");

			Button btn1 = (Button) scene.lookup("#btn1");
			Button btn2 = (Button) scene.lookup("#btn2");
			Button btn3 = (Button) scene.lookup("#btn3");
			Button btn4 = (Button) scene.lookup("#btn4");
			Button btn5 = (Button) scene.lookup("#btn5");
			Button btn6 = (Button) scene.lookup("#btn6");
			Button btn7 = (Button) scene.lookup("#btn7");
			Button btn8 = (Button) scene.lookup("#btn8");
			Button btn9 = (Button) scene.lookup("#btn9");
			Button btn0 = (Button) scene.lookup("#btn0");
			Button btnCall = (Button) scene.lookup("#btnCall");

			btnCall.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("Calling");
					alert.setHeaderText("Number");
					alert.setContentText(input.getText());

					alert.showAndWait();

				}
			});
			
			btn1.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 1);
				}
			
			});
			btn2.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 2);
				}
				
			});
			btn3.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 3);
				}
				
			});
			btn4.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 4);
				}
				
			});
			btn5.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 5);
				}
				
			});
			btn6.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 6);
				}
				
			});
			btn7.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 7);
				}
				
			});
			btn8.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 8);
				}
				
			});
			btn9.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 9);
				}
				
			});
			btn0.setOnMouseClicked(new EventHandler<Event>() {
				
				@Override
				public void handle(Event event) {
					input.setText(input.getText() + 0);
				}
				
			});

			primaryStage.setTitle("first javaFx button show");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
