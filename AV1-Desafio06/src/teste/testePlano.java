package teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dominio.Plano;

class testePlano {

	Plano plano = new Plano(1, 2, 3, 4);
	@Test
	public void testCalculaDistancia() {
		Assert.assertEquals(2.8284270763397217, plano.calculaDistancia(), 0);
	}

}
