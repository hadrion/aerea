package com.hadrion.aerea.dominio.aviao;

public interface AviaoRepositorio {

	void salvar(Aviao airbus);

	Aviao obterPeloId(AviaoId aviaoId);

	void remover(Aviao airbus);

}
