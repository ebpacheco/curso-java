package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();

		setHgap(10); // Espaco na horizontal
		setVgap(10); // Espaco na vertical
		setPadding(new Insets(10)); // Espaco para todos os lados de 10(top, left, right, bottom)

		setOrientation(Orientation.VERTICAL); // Setando os valores na vertical
		setAlignment(Pos.CENTER_RIGHT); // Alinhando os objetos no centro lado direito

		getChildren().addAll(q1, q2, q3, q4, q5);
	}
}
