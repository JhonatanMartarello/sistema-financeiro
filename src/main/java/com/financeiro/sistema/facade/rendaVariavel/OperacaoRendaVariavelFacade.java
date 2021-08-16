package com.financeiro.sistema.facade.rendaVariavel;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import com.financeiro.sistema.constantes.Constantes;
import com.financeiro.sistema.entity.configuracao.OperacaoTaxaVO;
import com.financeiro.sistema.entity.rendaVariavel.OperacaoRendaVariavelVO;
import com.financeiro.sistema.facade.configuracao.OperacaoTaxaFacade;
import com.financeiro.sistema.processarArquivo.entity.arquivoCei.HistoricoNegociacaoCeiVO;
import com.financeiro.sistema.repository.rendaVariavel.OperacaoRendaVariavelRepository;

@Transactional
public class OperacaoRendaVariavelFacade {

    public void calcularIncluirValorOperacao(HistoricoNegociacaoCeiVO historicoNegociacaoCeiVO) {

        OperacaoTaxaVO operacaoTaxaVO = new OperacaoTaxaFacade()
                .carregarOperacaoTaxaAtiva(Constantes.TIPO_OPERACAO_SWINGTRADE);

        OperacaoRendaVariavelVO operacaoRendaVariavelVO = new OperacaoRendaVariavelVO();

        BigDecimal valor = historicoNegociacaoCeiVO.getValor();

        operacaoRendaVariavelVO.setValor(valor);
        operacaoRendaVariavelVO.setPreco(historicoNegociacaoCeiVO.getPreco());
        operacaoRendaVariavelVO.setQuantidade(historicoNegociacaoCeiVO.getQuantidade());
        operacaoRendaVariavelVO.setDataMovimento(historicoNegociacaoCeiVO.getDataNegocio());
        operacaoRendaVariavelVO.setCorretagem(BigDecimal.ZERO);
        operacaoRendaVariavelVO.setOperacaoTaxaVO(operacaoTaxaVO);

        operacaoRendaVariavelVO.setTipoMovimento(historicoNegociacaoCeiVO.getTipoMovimento());
        operacaoRendaVariavelVO.setEmolumentos(this.calcularEmolumentos(valor, operacaoTaxaVO.getEmolumento()));
        operacaoRendaVariavelVO
                .setTaxaLiquidacao(this.calcularTaxaLiquidacao(valor, operacaoTaxaVO.getTaxaLiquidacao()));

        operacaoRendaVariavelVO.setCustoTotal(this.calcularCustoTotal(operacaoRendaVariavelVO));
        operacaoRendaVariavelVO.setValorTotal(this.calcularValorTotal(operacaoRendaVariavelVO));

        new OperacaoRendaVariavelRepository().incluir(operacaoRendaVariavelVO);

    }

    private BigDecimal calcularTaxaLiquidacao(BigDecimal valorOperacao, BigDecimal taxaLiquidacao) {
        BigDecimal valorTaxaLiquidacao = valorOperacao.multiply(taxaLiquidacao);
        return valorTaxaLiquidacao;
    }

    private BigDecimal calcularEmolumentos(BigDecimal valorOperacao, BigDecimal emolumento) {
        BigDecimal valorTaxaLiquidacao = valorOperacao.multiply(emolumento);
        return valorTaxaLiquidacao;
    }

    private BigDecimal calcularCustoTotal(OperacaoRendaVariavelVO vo) {
        return vo.getCorretagem().add(vo.getEmolumentos()).add(vo.getTaxaLiquidacao());
    }

    private BigDecimal calcularValorTotal(OperacaoRendaVariavelVO vo) {
        return vo.getValor().add(vo.getCustoTotal());
    }

}
