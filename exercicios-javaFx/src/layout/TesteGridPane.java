package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

	public TesteGridPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		setGridLinesVisible(true); // Mostra o grid de linha

		getColumnConstraints().addAll(cc(), cc(), fixoCc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), fixoRc(), rc(), rc());

		setVgap(10);
		setHgap(10);

		add(c1, 0, 0, 2, 2); // Adicionando a caixa1 a partir do indice 0,0 e vai expandir mais 2,2
		add(c2, 1, 1, 2, 2); // Adicionando a caixa2 a partir do indice 1,1 e vai expandir mais 2,2
		add(c3, 4, 2, 1, 3); // Adicionando a caixa3 a partir do indice 4(coluna),2(linha) e vai expandir 3
								// linhas
		add(c4, 3, 1); // Adicionando a caixa4 na coluna 3 e linha 1
		add(c5, 0, 4, 2, 1);// Adicionando a caixa5 a partir do indice 0,4 e vai expandir 2 colunas
		add(c6, 3, 3);
	}

	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}

	// Aqui estamos passando um valor fixo para a coluna e nao de porcentagem igual
	// os outros casos, sendo assim o valor fixo pode baguncar visualmente nossa
	// tela
	private ColumnConstraints fixoCc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setMinWidth(200);
		cc.setMaxWidth(200);
		cc.setFillWidth(true);
		return cc;
	}

	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}

	// Aqui estamos passando um valor fixo para a linha e nao de porcentagem igual
	// os outros casos, sendo assim o valor fixo pode baguncar visualmente nossa
	// tela
	private RowConstraints fixoRc() {
		RowConstraints rc = new RowConstraints();
		rc.setMinHeight(200);
		rc.setMaxHeight(200);
		rc.setFillHeight(true);
		return rc;
	}
}
