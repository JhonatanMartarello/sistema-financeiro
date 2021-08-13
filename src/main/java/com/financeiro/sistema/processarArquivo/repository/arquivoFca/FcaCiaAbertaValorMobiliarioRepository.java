package com.financeiro.sistema.processarArquivo.repository.arquivoFca;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.processarArquivo.entity.arquivoFca.FcaCiaAbertaValorMobiliarioVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class FcaCiaAbertaValorMobiliarioRepository implements PanacheRepository<FcaCiaAbertaValorMobiliarioVO>{
    
    public void incluir (FcaCiaAbertaValorMobiliarioVO fcaCiaAbertaGeralVO){
        fcaCiaAbertaGeralVO.persist();
        
    }
}
