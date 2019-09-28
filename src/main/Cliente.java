package main;

public class Cliente {
	
	public int desconto;
	
	public Cliente(int desconto) {
		super();
		this.desconto = desconto;
	}

	public double obterValorComDesconto(Pedido pedido){
		if(desconto <= 0.0) {
			return pedido.obterValorBase();
		}  
		if (desconto >= 100) {
			return pedido.obterValorBase();
		}
		return pedido.obterValorBase() - (pedido.obterValorBase()*(desconto/100.0));
	}

}
