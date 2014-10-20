package com.hadrion.aerea.dominio.aviao;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aviao {
	
	@Embedded
	private AviaoId aviaoId;
	
	private String modelo; 
	private int assentos;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	public Aviao(AviaoId aviaoId, String modelo, int assentos) {
		super();
		this.aviaoId = aviaoId;
		this.modelo = modelo;
		this.assentos = assentos;
	}
	/*
	 * Somente para JPA
	 */
	@SuppressWarnings("unused")
	private Aviao(){}
	
	public AviaoId aviaoId() {
		return aviaoId;
	}
	
	public String modelo(){
		return modelo;
	}
	
	public int assentos(){
		return assentos;
	}


	public void alterarModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
