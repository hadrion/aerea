package com.hadrion.aerea.persistencia;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.hadrion.aerea.dominio.aviao.Aviao;
import com.hadrion.aerea.dominio.aviao.AviaoId;
import com.hadrion.aerea.dominio.aviao.AviaoRepositorio;

@Repository
@Transactional
@Profile("producao")
public class AviaoRepositorioJpa implements AviaoRepositorio{
	
	@Autowired
	private AviaoRepositorioSpringData repositorio;
	
	@Override
	public void salvar(Aviao aviao) {
		repositorio.save(aviao);
		System.out.println("Aviao salvo no banco de dados via JPA");
	}

	@Override
	public Aviao obterPeloId(AviaoId aviaoId) {
		return repositorio.findByAviaoId(aviaoId);
	}

	@Override
	public void remover(Aviao aviao) {
		repositorio.delete(aviao);
	}

}
