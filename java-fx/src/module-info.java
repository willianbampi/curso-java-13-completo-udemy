module java.fx {
	
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens br.com.projeto.fx.basico;
	opens br.com.projeto.fx.layout;
	opens br.com.projeto.fx.fxml;
	
}