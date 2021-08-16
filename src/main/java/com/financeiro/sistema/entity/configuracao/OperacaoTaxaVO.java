package com.financeiro.sistema.entity.configuracao;

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

import com.financeiro.sistema.entity.geral.RegistroVO;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_operacao_taxa")
public class OperacaoTaxaVO extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "opt_cod_operacao_taxa")
    private Long codOperacaoTaxa;

    @Column(name = "opt_descricao")
    private String descricao;

    @Column(name = "opt_taxa_liquidacao", columnDefinition = "Decimal(19,6)")
    private BigDecimal taxaLiquidacao;

    @Column(name = "opt_emolumento", columnDefinition = "Decimal(19,6)")
    private BigDecimal emolumento;

    @Column(name = "opt_data_inicial")
    private Date dataInicial;

    @Column(name = "opt_data_final")
    private Date dataFinal;

    @ManyToOne
    @JoinColumn(name = "opt_tipo_operacao")
    private RegistroVO tipoOperacao;

    public OperacaoTaxaVO() {
    }

    public Long getCodOperacaoTaxa() {
        return codOperacaoTaxa;
    }

    public void setCodOperacaoTaxa(Long codOperacaoTaxa) {
        this.codOperacaoTaxa = codOperacaoTaxa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getTaxaLiquidacao() {
        return taxaLiquidacao;
    }

    public void setTaxaLiquidacao(BigDecimal taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao;
    }

    public BigDecimal getEmolumento() {
        return emolumento;
    }

    public void setEmolumento(BigDecimal emolumento) {
        this.emolumento = emolumento;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public RegistroVO getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(RegistroVO tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

}
