package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Amostra;

public class testeAmostra {
	Amostra amostra10 = new Amostra(1, 6, 51, 80001);
	Amostra amostra9 = new Amostra(1, 6, 51, 79999);
	Amostra amostra8 = new Amostra(1, 6, 49, 79999);
	Amostra amostra7 = new Amostra(1, 7, 49, 79999);
	
	@Test
	public void testeInformaGrau() {
		Assert.assertEquals(10, amostra10.informaGrau());
		Assert.assertEquals(9, amostra9.informaGrau());
		Assert.assertEquals(8, amostra8.informaGrau());
		Assert.assertEquals(7, amostra7.informaGrau());
	}

}

