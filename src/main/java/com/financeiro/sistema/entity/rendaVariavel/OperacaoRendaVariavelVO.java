package com.financeiro.sistema.entity.rendaVariavel;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.financeiro.sistema.entity.configuracao.OperacaoTaxaVO;
import com.financeiro.sistema.entity.geral.RegistroVO;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_operacao_renda_variavel")
public class OperacaoRendaVariavelVO extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orv_cod_operacao")
    private Long codOperacao;

    @Column(name = "orv_data_movimento")
    private Date dataMovimento;

    @Column(name = "orv_quantidade")
    private Integer quantidade;

    @Column(name = "orv_valor_operacao")
    private BigDecimal valor;

    @Column(name = "orv_preco")
    private BigDecimal preco;

    @Column(name = "orv_taxa_liquidacao")
    private BigDecimal taxaLiquidacao;

    @ManyToOne
    @JoinColumn(name = "orv_tipo_movimento")
    private RegistroVO tipoMovimento;

    @Column(name = "orv_emolumentos")
    private BigDecimal emolumentos;

    @Column(name = "orv_corretagem")
    private BigDecimal corretagem;

    @Column(name = "orv_custo")
    private BigDecimal custoTotal;

    @Column(name = "orv_valor_operacao_total")
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "orv_resultado_renda_variavel")
    private ResultadoRendaVariavelVO resultadoRendaVariavel;

    @ManyToOne
    @JoinColumn(name = "orv_codigo_operacao_taxa")
    private OperacaoTaxaVO operacaoTaxaVO;

    public OperacaoRendaVariavelVO() {

    }

    public Long getCodOperacao() {
        return codOperacao;
    }

    public void setCodOperacao(Long codOperacao) {
        this.codOperacao = codOperacao;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public RegistroVO getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(RegistroVO tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public BigDecimal getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(BigDecimal custoTotal) {
        this.custoTotal = custoTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ResultadoRendaVariavelVO getResultadoRendaVariavel() {
        return resultadoRendaVariavel;
    }

    public void setResultadoRendaVariavel(ResultadoRendaVariavelVO resultadoRendaVariavel) {
        this.resultadoRendaVariavel = resultadoRendaVariavel;
    }

    public BigDecimal getTaxaLiquidacao() {
        return taxaLiquidacao;
    }

    public void setTaxaLiquidacao(BigDecimal taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao;
    }

    public BigDecimal getEmolumentos() {
        return emolumentos;
    }

    public void setEmolumentos(BigDecimal emolumentos) {
        this.emolumentos = emolumentos;
    }

    public BigDecimal getCorretagem() {
        return corretagem;
    }

    public void setCorretagem(BigDecimal corretagem) {
        this.corretagem = corretagem;
    }

    public OperacaoTaxaVO getOperacaoTaxaVO() {
        return operacaoTaxaVO;
    }

    public void setOperacaoTaxaVO(OperacaoTaxaVO operacaoTaxaVO) {
        this.operacaoTaxaVO = operacaoTaxaVO;
    }

}
