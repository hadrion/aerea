package com.hadrion.aerea.persistencia;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.hadrion.aerea.dominio.aviao.Aviao;
import com.hadrion.aerea.dominio.aviao.AviaoId;
import com.hadrion.aerea.dominio.aviao.AviaoRepositorio;

@Repository
@Profile("apresentacao")
public class AviaoRepositorioMemoria implements AviaoRepositorio {
	
	private Map<AviaoId,Aviao> store = new HashMap<AviaoId,Aviao>();
	
	@Override
	public void salvar(Aviao aviao) {
		store.put(aviao.aviaoId(), aviao);
		System.out.println("Aviao salvo na memória via mão de comer");
	}

	@Override
	public Aviao obterPeloId(AviaoId aviaoId) {
		return store.containsKey(aviaoId) ? 
				store.get(aviaoId) : null;
	}

	@Override
	public void remover(Aviao aviao) {
		store.remove(aviao);
	}

}
