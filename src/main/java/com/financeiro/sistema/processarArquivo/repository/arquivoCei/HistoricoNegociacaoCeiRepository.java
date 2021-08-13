package com.financeiro.sistema.processarArquivo.repository.arquivoCei;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.processarArquivo.entity.arquivoCei.HistoricoNegociacaoCeiVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class HistoricoNegociacaoCeiRepository implements PanacheRepository<HistoricoNegociacaoCeiVO> {

    public void incluir(HistoricoNegociacaoCeiVO historicoNegociacaoCeiVO) {
        historicoNegociacaoCeiVO.persist();
    }
    
}
