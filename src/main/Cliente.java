package main;

public class Cliente {
	
	public int desconto;
	
	public Cliente(int desconto) {
		super();
		this.desconto = desconto;
	}

	public double obterValorComDesconto(Pedido pedido) {
		return pedido.obterValorBase() - (pedido.obterValorBase()*(desconto/100));
	}

}
