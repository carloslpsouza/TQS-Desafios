package teste;
import org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import dominio.Paralelepipedo;

public class testeParalelepipedo {
	Paralelepipedo paralelepipedo = new Paralelepipedo(10, 10, 10);
	@Test
	public void testeCalculaDiagonal() {
		Assert.assertEquals(17.32050895690918, paralelepipedo.calculaDiagonal(), 0);
		
	}
}
