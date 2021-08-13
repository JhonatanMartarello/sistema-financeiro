package com.financeiro.sistema.facade.rendaVariavel;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import com.financeiro.sistema.entity.rendaVariavel.OperacaoRendaVariavelVO;
import com.financeiro.sistema.processarArquivo.entity.arquivoCei.HistoricoNegociacaoCeiVO;
import com.financeiro.sistema.repository.rendaVariavel.OperacaoRendaVariavelRepository;

@Transactional
public class OperacaoRendaVariavelFacade {

    public void calcularIncluirValorOperacao(HistoricoNegociacaoCeiVO historicoNegociacaoCeiVO) {

        OperacaoRendaVariavelVO operacaoRendaVariavelVO = new OperacaoRendaVariavelVO();

        BigDecimal valor = historicoNegociacaoCeiVO.getValor();

        operacaoRendaVariavelVO.setValor(valor);
        operacaoRendaVariavelVO.setPreco(historicoNegociacaoCeiVO.getPreco());
        operacaoRendaVariavelVO.setQuantidade(historicoNegociacaoCeiVO.getQuantidade());
        operacaoRendaVariavelVO.setDataMovimento(historicoNegociacaoCeiVO.getDataNegocio());
        operacaoRendaVariavelVO.setCorretagem(BigDecimal.ZERO);
        // operacaoRendaVariavelVO.setOperacao(operacao);
        
        operacaoRendaVariavelVO.setEmolumentos(this.calcularEmolumentos(valor));
        operacaoRendaVariavelVO.setTaxaLiquidacao(this.calcularTaxaLiquidacao(valor));

        operacaoRendaVariavelVO.setCustoTotal(this.calcularCustoTotal(operacaoRendaVariavelVO));
        operacaoRendaVariavelVO.setValorTotal(this.calcularValorTotal(operacaoRendaVariavelVO));

        new OperacaoRendaVariavelRepository().incluir(operacaoRendaVariavelVO);

    }

    private BigDecimal calcularTaxaLiquidacao(BigDecimal valorOperacao) {
        return null;
    }

    private BigDecimal calcularEmolumentos(BigDecimal valorOperacao) {
        return null;
    }

    private BigDecimal calcularCustoTotal(OperacaoRendaVariavelVO vo) {
        return vo.getCorretagem().add(vo.getEmolumentos()).add(vo.getTaxaLiquidacao());
    }

    private BigDecimal calcularValorTotal(OperacaoRendaVariavelVO vo) {
        return vo.getValor().add(vo.getCustoTotal());
    }
    
}
