package main;

import java.util.ArrayList;

public class Pedido {
	
	public ArrayList<LinhaPedido> linhapedidos;
	public Cliente cliente;
	public double valorSemDesconto;

	public Pedido(ArrayList<LinhaPedido> linhapedidos, Cliente cliente) {
		super();
		this.linhapedidos = linhapedidos;
		this.cliente = cliente;
	}

	public void calcularPreco() {
		for (LinhaPedido linhaPedido : linhapedidos) {
			this.valorSemDesconto += linhaPedido.calcularPreco();
		}
		
		double valorComDesconto = cliente.obterValorComDesconto(this);
		System.out.println("Valor com Desconto: "+valorComDesconto);
	}
	
	public double obterValorBase() {
		return this.valorSemDesconto;
	}
}
