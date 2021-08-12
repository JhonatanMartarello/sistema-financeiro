package com.financeiro.sistema.repository.arquivoCei;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.arquivoCei.HistoricoNegociacaoCeiVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class HistoricoNegociacaoCeiRepository implements PanacheRepository<HistoricoNegociacaoCeiVO> {

    public void incluir(HistoricoNegociacaoCeiVO historicoNegociacaoCeiVO) {
        historicoNegociacaoCeiVO.persist();
    }
    
}
