package loja.actors;

import java.util.List;

import loja.actions.CalcularPreco;

public class ProdutoComposto extends Produto{
	
	private List<Produto> produtos;
	private Desconto descontoFixo;
	
	public ProdutoComposto(String nomeProduto, List<Produto> produtos, Desconto descontoFixo) {
		super(nomeProduto, -1);
		this.produtos = produtos;
		this.descontoFixo = descontoFixo;
		
		this.valorProduto = calcularValorTotal();
		// TODO Auto-generated constructor stub
	}
	
	// Getters
	//
	// *new* 
	// return produtosContidos
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	//
	
	// Métodos privados
	
	// Calculo para montar o valor do pacote (ProdutoComposto)
	private double calcularValorTotal() { 
		double valorTotal = 0;
		
		// For Each
		for(Produto currentProduto : this.produtos) {
			// Adiciona ao valor total do ProdutoComposto
			valorTotal = valorTotal + currentProduto.getValorComDesconto();
		}
		
		// Faz o calculo do valor de desconto fixo do pacote
		valorTotal = CalcularPreco.Desconto(valorTotal, this.descontoFixo);
		
		return valorTotal;	
	}
	
	
}
