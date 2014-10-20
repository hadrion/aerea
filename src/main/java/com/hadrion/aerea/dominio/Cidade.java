package com.hadrion.aerea.dominio;

public enum Cidade {
	POA("Porto Alegre"),
	RAO("Ribeirão Preto"),
	RIO("Rio de Janeiro"),
	SAO("São Paulo");
	
	String nome;
	
	Cidade(String nome){
		this.nome = nome;
	}

	public static Cidade obterPeloNome(String nome) {
		for (Cidade cidade : Cidade.values()) {
			if (cidade.nome.equals(nome))
				return cidade;
		}
		return null;
	}
}
