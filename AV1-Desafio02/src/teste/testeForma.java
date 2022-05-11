package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Forma;

public class testeForma {
	Forma equilatero = new Forma(10,10,10);
	Forma isosceles = new Forma(10,10,5);
	Forma escaleno = new Forma(8,7,5);
	Forma nao_e_tri = new Forma(10,10,20);
	@Test
	public void testeVerificaForma() {
		Assert.assertEquals("triangulo equilatero", equilatero.verificaForma());
		Assert.assertEquals("triangulo isosceles", isosceles.verificaForma());
		Assert.assertEquals("triangulo escaleno", escaleno.verificaForma());
		Assert.assertEquals("não eh um triangulo", nao_e_tri.verificaForma());
	}

}
