package com.financeiro.sistema.repository.arquivosFca;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.arquivosFca.FcaCiaAbertaGeralVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaGeralRepository implements PanacheRepository<FcaCiaAbertaGeralVO>{
    
    public void incluir (FcaCiaAbertaGeralVO fcaCiaAbertaGeralVO){
        fcaCiaAbertaGeralVO.persist();
    }
}
