package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML // O nome precisa ser igual a ID do arquivo FXML
	private TextField campoEmail;

	@FXML // O nome precisa ser igual a ID do arquivo FXML
	private PasswordField campoSenha;

	public void entrar() {

		boolean validarEmail = campoEmail.getText().equals("eduardo@teste.com");
		boolean validarSenha = campoSenha.getText().equals("1234");

		if (validarEmail && validarSenha) {
			Notifications.create().position(Pos.CENTER).title("Login FXML").text("Login efetuado com sucesso")
					.showInformation();
		} else {
			Notifications.create().position(Pos.CENTER).title("Login FXML").text("Usuário/Senha inválido").showError();
		}
	}
}
