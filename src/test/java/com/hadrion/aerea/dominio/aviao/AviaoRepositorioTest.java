package com.hadrion.aerea.dominio.aviao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.hadrion.aerea.config.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Application.class}, 
	loader = SpringApplicationContextLoader.class)
@ActiveProfiles("producao")
@Transactional
public class AviaoRepositorioTest {
	
	@Autowired
	private AviaoRepositorio repositorio;
	
	@Test
	public void salvar(){
		Aviao airbus = new Aviao(
				new AviaoId("1234"),
				"AirBus 380",
				853);
		
		repositorio.salvar(airbus);
		
		airbus = repositorio.obterPeloId(new AviaoId("1234"));
		
		assertEquals(new AviaoId("1234"),airbus.aviaoId());
		assertEquals("AirBus 380", airbus.modelo());
		assertEquals(853,airbus.assentos());
		
	}
	
	@Test
	public void remover(){
		Aviao airbus = new Aviao(
				new AviaoId("1234"),
				"AirBus 380",
				853);
		
		repositorio.salvar(airbus);
		
		repositorio.remover(airbus);
		
		assertNull(repositorio.obterPeloId(new AviaoId("1234")));
		
	}
	
	
}
