package loja.actions;

import loja.actors.Desconto;

public class CalcularPreco {
	
	
	public static double Desconto(Double valorProduto, Desconto desconto) {
		
		if(desconto == null){
			return valorProduto;
		}
		
		if(desconto.isPorcentagem() == true) {
			double valorDesconto = desconto.getValorDesconto();
			double calculoPorcentagem = valorProduto * (valorDesconto/100);
			return valorProduto - calculoPorcentagem;
		}
		else {
			
			double valorDesconto = desconto.getValorDesconto();
			return valorProduto - valorDesconto;
		}
	}
	


}

/*
public static double DescontoMultiplo(Double valorProduto, List<Desconto> descontos) {
	
	if(descontos != null) {
		for(Desconto currentDesconto : descontos) {
			
			if(currentDesconto.isPorcentagem() == true) {
				double valorDesconto = currentDesconto.getValorDesconto();
				double calculoPorcentagem = valorProduto * (valorDesconto/100);
				return valorProduto - calculoPorcentagem;
			}
			else {
				
				double valorDesconto = currentDesconto.getValorDesconto();
				return valorProduto - valorDesconto;
			}
		}
	}
	return valorProduto;
}
*/