package com.financeiro.sistema.repository.configuracao;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.configuracao.OperacaoTaxaVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;

@ApplicationScoped
public class OperacaoTaxaRepository implements PanacheRepository<OperacaoTaxaVO> {

    public OperacaoTaxaVO carregarOperacaoTaxaAtiva(Long tipoOperacao) {
        return OperacaoTaxaVO.find("FROM OperacaoTaxaVO where tipoOperacao.codRegistro = :tipoOperacao and dataFinal is null", Parameters.with("tipoOperacao", tipoOperacao)).singleResult();
    }
    
}
