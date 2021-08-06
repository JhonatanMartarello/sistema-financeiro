package com.financeiro.sistema.entity.rendaVariavel;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.financeiro.sistema.entity.geral.Registro;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_operacao_renda_variavel")
public class OperacaoRendaVariavel extends PanacheEntityBase{
    @Id
    @GeneratedValue
    @Column(name = "orv_cod_operacao")
    private Long codOperacao;

    @Column(name = "orv_data_movimento")
    private Timestamp dataMovimento;

    @Column(name = "orv_quantidade")
    private Integer quantidade;

    @Column(name = "orv_valor")
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "orv_operacao")
    private Registro operacao;

    @Column(name = "orv_custo")
    private BigDecimal custo;

    @Column(name = "orv_valor_total")
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "orv_resultado_renda_variavel")
    private ResultadoRendaVariavel resultadoRendaVariavel;

    public OperacaoRendaVariavel(){

    }


    
}
