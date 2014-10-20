package com.hadrion.aerea.persistencia;

import org.springframework.data.repository.CrudRepository;

import com.hadrion.aerea.dominio.aviao.Aviao;
import com.hadrion.aerea.dominio.aviao.AviaoId;

public interface AviaoRepositorioSpringData 
	extends CrudRepository<Aviao, Long>{
	
	Aviao findByAviaoId(AviaoId aviaoId);
	
}
