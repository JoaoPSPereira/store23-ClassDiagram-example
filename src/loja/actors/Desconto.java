package loja.actors;

public class Desconto {
	
	private String nomeDesconto;
	private double valorDesconto;
	private boolean isPorcentagem;
	
	public Desconto(String nomeDesconto, double valorDesconto, boolean porcentagem) {
		this.nomeDesconto = nomeDesconto;
		this.valorDesconto = valorDesconto;
		this.isPorcentagem = porcentagem;
	}
	
	public String getNomeDesconto() {
		return nomeDesconto;
	}
	
	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public boolean isPorcentagem() {
		return isPorcentagem;
	}
}
