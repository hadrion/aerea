package com.hadrion.aerea.dominio.voo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class VooId {
	
	private String id;

	public VooId(String id) {
		super();
		this.id = id;
	}
	
	public String id(){
		return id;
	}
	
	@Override
	public boolean equals(Object objeto) {
		boolean objetosIguais = false;

		if (objeto != null && this.getClass() == objeto.getClass()) {
			VooId objetoTipado = (VooId) objeto;
			objetosIguais = new EqualsBuilder()
				.append(id, objetoTipado.id)
				.isEquals();
		}

		return objetosIguais;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(3917,11)
		.append(id)
		.toHashCode();
	}
	
	@Override
	public String toString() {
		return id;
	}

	
}
