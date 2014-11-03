package com.hadrion.aerea.dominio.voo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.hadrion.aerea.dominio.Cpf;

public class Reserva {
	
	private int assentos;
	private Cpf cpf;
	
	public Reserva(int assentos, Cpf cpf) {
		this.assentos = assentos;
		this.cpf = cpf;
	}

	public int assentos() {
		return assentos;
	}

	public Cpf cpf() {
		return cpf;
	}
	
	@Override
	public boolean equals(Object objeto) {
		boolean objetosIguais = false;

		if (objeto != null && this.getClass() == objeto.getClass()) {
			Reserva objetoTipado = (Reserva) objeto;
			objetosIguais = new EqualsBuilder()
				.append(assentos, objetoTipado.assentos)
				.append(cpf, objetoTipado.cpf)
				.isEquals();
		}

		return objetosIguais;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(7755,13)
		.append(assentos)
		.append(cpf)
		.toHashCode();
	}
	
	@Override
	public String toString() {
		return "Reserva[" 
				+ "assentos:" + assentos
				+ ", cpf: " + cpf
				+ "]";
	}

}
