package loja.main;

import java.util.ArrayList;
import java.util.List;

import loja.actions.AplicarDesconto;
import loja.actors.Desconto;
import loja.actors.Produto;
import loja.actors.ProdutoComposto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto("copo", 5);
		Produto p2 = new Produto("caneta", 2);
		
		Desconto d1 = new Desconto("DescontoDiaDosProfessores", 1, false);
		AplicarDesconto.Aplicar(p2, d1);
		
		System.out.println(p1.getNomeProduto());
		System.out.println(p1.getValorProduto());
		System.out.println(p1.getValorComDesconto());
		
		System.out.println(p2.getNomeProduto());
		System.out.println(p2.getValorProduto());
		System.out.println(p2.getValorComDesconto());
		
		List<Produto> lista = new ArrayList<Produto>();
		lista.add(p1);
		lista.add(p2);
		
		Desconto d2 = new Desconto("descontoCopoCaneta", 10, true);
		
		Produto pack1 = new ProdutoComposto("Copo + Caneta", lista, d2);
		
		System.out.println(pack1.getNomeProduto());
		System.out.println(pack1.getValorProduto());
		System.out.println(pack1.getValorComDesconto());
	}
}
