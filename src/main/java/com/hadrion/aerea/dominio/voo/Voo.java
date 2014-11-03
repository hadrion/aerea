package com.hadrion.aerea.dominio.voo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.hadrion.aerea.dominio.Cpf;
import com.hadrion.aerea.dominio.Trecho;
import com.hadrion.aerea.dominio.aviao.AviaoId;

public class Voo {
	
	private VooId vooId;
	private Trecho trecho;
	private Date partida;
	private AviaoId aviaoId;
	
	private Set<Reserva> reservas;
	
	public Voo(VooId vooId, Trecho trecho, Date partida, AviaoId aviaoId) {
		this.vooId = vooId;
		this.trecho = trecho;
		this.setPartida(partida);
		this.aviaoId = aviaoId;
	}

	public VooId vooId() {
		return vooId;
	}

	public Trecho trecho() {
		return trecho;
	}

	public Date partida() {
		return partida;
	}

	public AviaoId aviaoId() {
		return aviaoId;
	}
	
	private void setPartida(Date partida){
		if (partida == null)
			throw new IllegalArgumentException("Partida não pode ser nula");
		
		this.partida = partida;
	}

	public Reserva novaReserva(int assentos, Cpf cpf) {
		Reserva reserva = new Reserva(assentos,cpf);
		getReservas().add(reserva);
		return reserva;
	}

	public int assentosReservados() {
		int result = 0;
		for (Reserva reserva : getReservas())
			result += reserva.assentos();
		return result;
	}
	
	private Set<Reserva> getReservas(){
		if (reservas == null)
			reservas = new HashSet<Reserva>();
		return reservas;
	}


}
