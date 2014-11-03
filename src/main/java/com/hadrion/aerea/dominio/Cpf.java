package com.hadrion.aerea.dominio;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Cpf {
	
	private String numero;

	public Cpf(String numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object objeto) {
		boolean objetosIguais = false;

		if (objeto != null && this.getClass() == objeto.getClass()) {
			Cpf objetoTipado = (Cpf) objeto;
			objetosIguais = new EqualsBuilder()
				.append(numero, objetoTipado.numero)
				.isEquals();
		}

		return objetosIguais;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(77689,67)
		.append(numero)
		.toHashCode();
	}
	
	@Override
	public String toString() {
		return numero;
	}


}
