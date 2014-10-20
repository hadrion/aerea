package com.hadrion.aerea.dominio;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Trecho {
	
	private Cidade origem;
	private Cidade destino;
	
	public Trecho(Cidade origem, Cidade destino) {
		this.origem = origem;
		this.destino = destino;
	}
	
	@Override
	public boolean equals(Object objeto) {
		boolean objetosIguais = false;

		if (objeto != null && this.getClass() == objeto.getClass()) {
			Trecho objetoTipado = (Trecho) objeto;
			objetosIguais = new EqualsBuilder()
				.append(origem, objetoTipado.origem)
				.append(destino, objetoTipado.destino)
				.isEquals();
		}

		return objetosIguais;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(3219,121)
		.append(origem)
		.append(destino)
		.toHashCode();
	}
	
	@Override
	public String toString() {
		return "Trecho [origem=" + origem
			+ ",destino=" + destino
			+ "]";
	}	
}
