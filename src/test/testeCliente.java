package test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import main.Cliente;
import main.Pedido;

public class testeCliente {

	private Cliente cliente;

	@Mock
	private Pedido pedido;
	
	@Test
	public void testarobterValorComDesconto() {
		when(pedido.obterValorBase()).thenReturn(100.00);
		cliente = new Cliente(10);
		double result = cliente.obterValorComDesconto(pedido);
		Assert.assertEquals(result,90.00);
	}
}
