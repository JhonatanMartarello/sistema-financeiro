package com.financeiro.sistema.entity.rendaVariavel;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_resultado_renda_variavel")
public class ResultadoRendaVariavelVO extends PanacheEntityBase {
    
    @Id
    private Long codResultadoRendaVariavel;

    @ManyToOne(fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "rrv_cnpj_papel")
    private PapelVO cnpjPapel;

    @Column(name = "rrv_quantidade_total")
    private Integer quantidadeTotal;

    @Column(name = "rrv_valor_total")
    private BigDecimal valorTotal;

    @Column(name = "rrv_dividendos_total")
    private BigDecimal dividendosTotal;

    @Column(name = "rrv_resultado_total")
    private BigDecimal resultadoTotal;

    @Column(name = "rrv_preco_medio")
    private BigDecimal precoMedio;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="resultadoRendaVariavel")
    private List<OperacaoRendaVariavelVO> listaOperacaoRendaVariavel;



    public ResultadoRendaVariavelVO() {

    }

    public PapelVO getCnpjPapel() {
        return cnpjPapel;
    }

    public void setCnpjPapel(PapelVO cnpjPapel) {
        this.cnpjPapel = cnpjPapel;
    }

    public Integer getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(Integer quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getDividendosTotal() {
        return dividendosTotal;
    }

    public void setDividendosTotal(BigDecimal dividendosTotal) {
        this.dividendosTotal = dividendosTotal;
    }

    public BigDecimal getResultadoTotal() {
        return resultadoTotal;
    }

    public void setResultadoTotal(BigDecimal resultadoTotal) {
        this.resultadoTotal = resultadoTotal;
    }

    public BigDecimal getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(BigDecimal precoMedio) {
        this.precoMedio = precoMedio;
    }

    public Long getCodResultadoRendaVariavel() {
        return codResultadoRendaVariavel;
    }

    public void setCodResultadoRendaVariavel(Long codResultadoRendaVariavel) {
        this.codResultadoRendaVariavel = codResultadoRendaVariavel;
    }

    public List<OperacaoRendaVariavelVO> getListaOperacaoRendaVariavel() {
        return listaOperacaoRendaVariavel;
    }

    public void setListaOperacaoRendaVariavel(List<OperacaoRendaVariavelVO> listaOperacaoRendaVariavel) {
        this.listaOperacaoRendaVariavel = listaOperacaoRendaVariavel;
    }

    

    
}
