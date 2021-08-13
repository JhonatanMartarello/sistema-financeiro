package com.financeiro.sistema.repository.arquivoFca;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.arquivoFca.FcaCiaAbertaValorMobiliarioVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaValorMobiliarioRepository implements PanacheRepository<FcaCiaAbertaValorMobiliarioVO>{
    
    public void incluir (FcaCiaAbertaValorMobiliarioVO fcaCiaAbertaGeralVO){
        fcaCiaAbertaGeralVO.persist();
        
    }
}
