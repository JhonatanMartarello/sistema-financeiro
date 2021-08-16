package com.financeiro.sistema.facade.configuracao;

import com.financeiro.sistema.entity.configuracao.OperacaoTaxaVO;
import com.financeiro.sistema.repository.configuracao.OperacaoTaxaRepository;

public class OperacaoTaxaFacade {

    public OperacaoTaxaVO carregarOperacaoTaxaAtiva(Integer tipoOperacao) {
        return new OperacaoTaxaRepository().carregarOperacaoTaxaAtiva(tipoOperacao);
    }
    
}
