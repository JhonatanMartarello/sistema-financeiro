package com.financeiro.sistema.entity.rendaVariavel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_papel")
public class Papel extends PanacheEntityBase {
    @Id
    private Long cnpj;

    @Column(name = "pap_codigo_papel")
    private String codigoPapel;

    @Column(name = "pap_nome")
    private String nome;

    public Papel(){

    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoPapel() {
        return codigoPapel;
    }

    public void setCodigoPapel(String codigoPapel) {
        this.codigoPapel = codigoPapel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
