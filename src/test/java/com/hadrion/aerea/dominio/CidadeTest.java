package com.hadrion.aerea.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CidadeTest {
	
	@Test
	public void cidadesIguais(){
		assertEquals(Cidade.RAO, Cidade.RAO);
		assertEquals(Cidade.RAO,Cidade.obterPeloNome("Ribeirão Preto"));
	}

	@Test
	public void obterCidadeInexistente(){
		assertNull(Cidade.obterPeloNome("XYZ"));
	}
}
