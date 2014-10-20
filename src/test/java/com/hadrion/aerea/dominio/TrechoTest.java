package com.hadrion.aerea.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrechoTest {
	
	@Test
	public void novoTrecho(){
		assertEquals(
				new Trecho(Cidade.RAO,Cidade.SAO),
				new Trecho(Cidade.RAO,Cidade.SAO));
	}
	
}
