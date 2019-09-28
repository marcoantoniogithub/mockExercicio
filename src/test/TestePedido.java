package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import main.Cliente;
import main.LinhaPedido;
import main.Pedido;

@RunWith(MockitoJUnitRunner.class)
public class TestePedido {

	private Pedido pedido;	
	
	private List<LinhaPedido> linhaPedidos = new ArrayList<>();
	
	@Mock
	private LinhaPedido linhaPedido;
	
	@Mock
	private LinhaPedido linhaPedido2;
	
	@Mock
	private Cliente cliente;
	
	@Before
	public void iniciando() {
		MockitoAnnotations.initMocks(this);
		linhaPedidos.add(linhaPedido);
		linhaPedidos.add(linhaPedido2);
	}
	
	@Test
	public void testar1() {
		Mockito.when(linhaPedido.calcularPreco()).thenReturn(100.00);
		Mockito.when(linhaPedido2.calcularPreco()).thenReturn(100.00);
		pedido = new Pedido(linhaPedidos,cliente);
		Mockito.when(cliente.obterValorComDesconto(pedido)).thenReturn(10.0);
		pedido.calcularPreco();
		Assertions.assertEquals(pedido.valorSemDesconto,200.0);
	}
	
	@Test
	public void testar2() {
		Mockito.when(linhaPedido.calcularPreco()).thenReturn(100.00);
		Mockito.when(linhaPedido2.calcularPreco()).thenReturn(100.00);
		pedido = new Pedido(linhaPedidos,cliente);
		Mockito.when(cliente.obterValorComDesconto(pedido)).thenReturn(10.0);
		pedido.calcularPreco();
		Assertions.assertEquals(pedido.valorComDesconto,10.0);
	}
	
	@Test
	public void testar3() {
		Mockito.when(linhaPedido.calcularPreco()).thenReturn(100.00);
		Mockito.when(linhaPedido2.calcularPreco()).thenReturn(100.00);
		pedido = new Pedido(linhaPedidos,cliente);
		Mockito.when(cliente.obterValorComDesconto(pedido)).thenReturn(-10.0);
		pedido.calcularPreco();
		Assertions.assertEquals(pedido.valorComDesconto,0.0);
	}
	
	@Test
	public void testar4() {
		Mockito.when(linhaPedido.calcularPreco()).thenReturn(-100.00);
		Mockito.when(linhaPedido2.calcularPreco()).thenReturn(-500.00);
		pedido = new Pedido(linhaPedidos,cliente);
		Mockito.when(cliente.obterValorComDesconto(pedido)).thenReturn(10.0);
		pedido.calcularPreco();
		Assertions.assertEquals(pedido.valorSemDesconto,0.0);
	}
}
