package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Produto;

public class TesteProduto {
	Produto form_pag_1 = new Produto(1,1,50,1); //Valor esperado desconto 5 vl com desconto 45
	Produto form_pag_2 = new Produto(1,1,50,2); //Valor esperado desconto 1 vl com desconto 49
	Produto form_pag_3 = new Produto(1,1,50,3); //Valor esperado desconto 2.5  vl com desconto 47.5
	@Test
	public void testeCalculaDesconto(){
		Assert.assertEquals(5, form_pag_1.calculaDesconto(), 0);
		Assert.assertEquals(1, form_pag_2.calculaDesconto(), 0);
		Assert.assertEquals(2.5, form_pag_3.calculaDesconto(), 0);
	}
	
	@Test
	public void testeValorFinal(){
		Assert.assertEquals(45, form_pag_1.valorFinal(), 0);
		Assert.assertEquals(49, form_pag_2.valorFinal(), 0);
		Assert.assertEquals(47.5, form_pag_3.valorFinal(), 0);
	}

}
