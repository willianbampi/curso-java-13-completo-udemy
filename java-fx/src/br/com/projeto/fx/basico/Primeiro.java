package br.com.projeto.fx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Primeiro extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button botao1 = new Button("A");
		Button botao2 = new Button("B");
		Button botao3 = new Button("C");
		
		botao1.setOnAction(e -> System.out.println("A"));
		botao2.setOnAction(e -> System.out.println("B"));
		botao3.setOnAction(e -> System.exit(0));

		VBox box = new VBox();
		
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		
		box.getChildren().add(botao1);
		box.getChildren().add(botao2);
		box.getChildren().add(botao3);
		
		Scene cena = new Scene(box, 100, 150);
		
		primaryStage.setScene(cena);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
