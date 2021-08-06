package com.financeiro.sistema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_banco")
public class Banco extends PanacheEntityBase {
    @Id
    private Long numeroDocumento;
    @Column
    private String nome;

    public Banco() {
    }

    public Banco(Long numeroDocumento, String nome) {
        this.numeroDocumento = numeroDocumento;
        this.nome = nome;
    }
    
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
