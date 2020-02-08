package br.com.projeto.fx.layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	
	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("Texto 1");
		Caixa c2 = new Caixa().comTexto("Texto 2");
		Caixa c3 = new Caixa().comTexto("Texto 3");
		Caixa c4 = new Caixa().comTexto("Texto 4");
		Caixa c5 = new Caixa().comTexto("Texto 5");
		Caixa c6 = new Caixa().comTexto("Texto 6");
		
		getChildren().addAll(c1, c2, c3, c4, c5, c6);
		this.setOnMouseClicked(e -> {
			if(e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});
		
		Thread thread = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(3000);
					
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		});
		
		thread.setDaemon(true);
		
		thread.start();
	}
	
}
