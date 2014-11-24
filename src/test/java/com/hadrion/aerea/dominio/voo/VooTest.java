package com.hadrion.aerea.dominio.voo;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.hadrion.aerea.dominio.Cidade;
import com.hadrion.aerea.dominio.Cpf;
import com.hadrion.aerea.dominio.Trecho;
import com.hadrion.aerea.dominio.aviao.Aviao;
import com.hadrion.aerea.dominio.aviao.AviaoId;

public class VooTest {
	
	private Voo voo;
	
	private Aviao aviao;
	
	@Before
	public void setUp(){
		aviao = new Aviao(new AviaoId("BOEING"), "Boeing 777", 100);
		
		voo = new Voo(
				new VooId("1234"),
				new Trecho(Cidade.RAO, Cidade.SAO),
				new Date(),
				aviao);
	}
	
	@Test
	public void novoVoo(){
		
		Date partida = new Date();
		
		Voo voo = new Voo(
				new VooId("1234"),
				new Trecho(Cidade.RAO, Cidade.SAO),
				partida,
				aviao);
		
		assertEquals(new VooId("1234"), voo.vooId());
		assertEquals(new Trecho(Cidade.RAO, Cidade.SAO), voo.trecho());
		assertEquals(partida, voo.partida());
		assertEquals(new AviaoId("BOEING"), voo.aviaoId());
		
	}
	
	@Test
	public void novaReserva(){
		
		Reserva reserva = voo.novaReserva(2,new Cpf("11111111111"));
		
		assertEquals(2, reserva.assentos());
		assertEquals(new Cpf("11111111111"),reserva.cpf());
		
		assertEquals(2, voo.assentosReservados());

	}
	
	@Test
	public void assentosDisponiveis(){
		
		voo.novaReserva(5, new Cpf("11111111111"));
		assertEquals(95,voo.assentosDisponiveis());
		
		voo.novaReserva(10, new Cpf("11111111111"));
		assertEquals(85,voo.assentosDisponiveis());
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void assentosExcedentes(){
		voo.novaReserva(101, new Cpf("11111111111"));
	}
	
	//TODO Alteração da quantidade de assentos no aviao para menos
	
}
