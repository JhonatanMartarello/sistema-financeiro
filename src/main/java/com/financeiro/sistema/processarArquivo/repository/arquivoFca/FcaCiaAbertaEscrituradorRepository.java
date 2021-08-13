package com.financeiro.sistema.processarArquivo.repository.arquivoFca;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.processarArquivo.entity.arquivoFca.FcaCiaAbertaEscrituradorVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaEscrituradorRepository implements PanacheRepository<FcaCiaAbertaEscrituradorVO>{
    
    public void incluir (FcaCiaAbertaEscrituradorVO fcaCiaAbertaEscrituradorVO){
        fcaCiaAbertaEscrituradorVO.persist();
    }
}
