package teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import dominio.Massa;

class testeMassa {

	@Test
	public void testeCalculaTempo() {
		Massa massa = new Massa(100);
		massa.calculaTempo();
		Assert.assertEquals(0.390625, massa.getMassaFinal(), 0);
		Assert.assertEquals(100, massa.getMassaInicial(), 0);
		Assert.assertEquals(400, massa.getTempo(), 0);
	}

}
