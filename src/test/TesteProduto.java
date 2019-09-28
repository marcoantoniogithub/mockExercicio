package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import main.Produto;

@RunWith(MockitoJUnitRunner.class)
public class TesteProduto {

	private Produto produto;	
	
	@Before
	public void iniciando() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testarObterPrecoComQuantidadeNegativa() {
		produto = new Produto(10.0);
		double result = produto.obterPreco(-1);
		Assertions.assertEquals(result,0.0);
	}
	
	@Test
	public void testarObterPrecoCerto() {
		produto = new Produto(10.0);
		double result = produto.obterPreco(2);
		Assertions.assertEquals(result,20.0);
	}
	
	@Test
	public void testarObterPrecoComProdutoNegativo() {
		produto = new Produto(-10.0);
		double result = produto.obterPreco(1);
		Assertions.assertEquals(result,0.0);
	}
}
