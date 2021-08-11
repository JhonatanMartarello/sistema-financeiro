package com.financeiro.sistema.repository.arquivosFca;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;

import com.financeiro.sistema.entity.arquivosFca.FcaCiaAbertaValorMobiliarioVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaValorMobiliarioRepository implements PanacheRepository<FcaCiaAbertaValorMobiliarioVO>{
    
    public void incluir (FcaCiaAbertaValorMobiliarioVO fcaCiaAbertaGeralVO){
        fcaCiaAbertaGeralVO.persist();
        
    }
}
