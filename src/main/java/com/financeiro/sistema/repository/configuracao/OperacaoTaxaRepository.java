package com.financeiro.sistema.repository.configuracao;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.configuracao.OperacaoTaxaVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OperacaoTaxaRepository implements PanacheRepository<OperacaoTaxaVO> {

    public OperacaoTaxaVO carregarOperacaoTaxaAtiva(Integer tipoOperacao) {
        return (OperacaoTaxaVO) OperacaoTaxaVO.find("FROM OperacaoTaxaVO where tipoOperacao.codRegistro = :tipoOperacao and dataFinal isnull", tipoOperacao);
    }
    
}
