package loja.actions;

import loja.actors.Desconto;
import loja.actors.Produto;

public class AplicarDesconto {
	
	public static void Aplicar(Produto produto, Desconto desconto) {
		produto.setDesconto(desconto);
	}
}
