package loja.actors;

import java.util.List;

import loja.actions.CalcularPreco;

public class Produto {
	protected String nomeProduto;
	protected double valorProduto;
	protected Desconto desconto;
	
	public Produto(String nomeProduto, double valorProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	
	// Getters
	// nomeProduto
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	// return valorProduto
	public double getValorProduto() {
		return valorProduto;
	}

	// return valor - desconto
	public double getValorComDesconto() {
		return CalcularPreco.Desconto(this.valorProduto, this.desconto);
	}
	
	// return this.desconto
	public Desconto getDesconto() {
		return desconto;
	}

	// Setters
	// set this.desconto
	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
