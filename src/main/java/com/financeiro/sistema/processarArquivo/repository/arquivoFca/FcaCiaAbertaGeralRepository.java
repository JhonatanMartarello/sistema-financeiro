package com.financeiro.sistema.processarArquivo.repository.arquivoFca;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.processarArquivo.entity.arquivoFca.FcaCiaAbertaGeralVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaGeralRepository implements PanacheRepository<FcaCiaAbertaGeralVO>{
    
    public void incluir (FcaCiaAbertaGeralVO fcaCiaAbertaGeralVO){
        fcaCiaAbertaGeralVO.persist();
    }
}
