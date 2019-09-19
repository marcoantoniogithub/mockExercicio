package main;

public class Produto {

	public double preco;

	public Produto(double preco) {
		super();
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double obterPreco(int quantidade){
		return  preco * quantidade;
	}
}
