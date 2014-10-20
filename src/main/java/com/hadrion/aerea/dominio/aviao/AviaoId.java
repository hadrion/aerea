package com.hadrion.aerea.dominio.aviao;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Embeddable
public class AviaoId {
	
	@Column(name="AVIAO_ID")
	private String id;
	
	public AviaoId(String id) {
		this.id = id;
	}
	
	/**
	 * Somente para JPA
	 */
	@SuppressWarnings("unused")
	private AviaoId(){}
	
	public String id(){
		return id;
	}
	
	@Override
	public boolean equals(Object objeto) {
		boolean objetosIguais = false;

		if (objeto != null && this.getClass() == objeto.getClass()) {
			AviaoId objetoTipado = (AviaoId) objeto;
			objetosIguais = new EqualsBuilder()
				.append(id, objetoTipado.id)
				.isEquals();
		}

		return objetosIguais;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(1239,87)
		.append(id)
		.toHashCode();
	}
	
	@Override
	public String toString() {
		return id;
	}

}
