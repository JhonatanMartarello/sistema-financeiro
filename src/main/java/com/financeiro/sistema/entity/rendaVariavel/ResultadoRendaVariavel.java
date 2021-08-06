package com.financeiro.sistema.entity.rendaVariavel;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_resultado_renda_variavel")
public class ResultadoRendaVariavel extends PanacheEntityBase {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cnpj")
    @Column(name = "rrv_cnpj_papel")
    private Papel cnpjPapel;

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
    private ArrayList<OperacaoRendaVariavel> operacoesRendaVariavel;



    public ResultadoRendaVariavel() {

    }

    public Papel getCnpjPapel() {
        return cnpjPapel;
    }

    public void setCnpjPapel(Papel cnpjPapel) {
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

    

    
}
