package com.hadrion.aerea.dominio.aviao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AviaoTest {
	
	private Aviao aviao;
	
	@Before
	public void setUp(){
		aviao = new Aviao(
			new AviaoId("1111"),
			"Boeing",
			500);
	}

	@Test
	public void novoAviao(){
		Aviao airbus = new Aviao(
				new AviaoId("1234"),
				"AirBus 380",
				853);
		
		assertEquals(new AviaoId("1234"),airbus.aviaoId());
		assertEquals("AirBus 380",airbus.modelo());
		assertEquals(853, airbus.assentos());
	}
	
	@Test
	public void alterarModelo(){
		aviao.alterarModelo("Boeing 777");
		assertEquals("Boeing 777",aviao.modelo());
	}
	
}
