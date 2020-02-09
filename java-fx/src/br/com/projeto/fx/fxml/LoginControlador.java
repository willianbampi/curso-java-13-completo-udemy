package br.com.projeto.fx.fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("teste@teste.com.br");
		boolean senhaValida = campoSenha.getText().equals("123");
		
		if(emailValido && senhaValida) {
			Notifications.create().position(Pos.TOP_CENTER).title("Login JFX").text("Login Efetuado com sucesso!").showInformation();
		} else {
			Notifications.create().position(Pos.TOP_CENTER).title("Login JFX").text("Usuário ou senha inválidos!").showError();;
		}
	}

}
