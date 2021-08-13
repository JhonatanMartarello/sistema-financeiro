package com.financeiro.sistema.repository.arquivoFca;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.arquivoFca.FcaCiaAbertaGeralVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaGeralRepository implements PanacheRepository<FcaCiaAbertaGeralVO>{
    
    public void incluir (FcaCiaAbertaGeralVO fcaCiaAbertaGeralVO){
        fcaCiaAbertaGeralVO.persist();
    }
}
