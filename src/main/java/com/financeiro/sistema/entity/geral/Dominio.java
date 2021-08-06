package com.financeiro.sistema.entity.geral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dominio")
public class Dominio {
    @Id
    @Column(name = "dom_cod_dominio")
    private Long codDominio;

    @Column(name = "dom_descricao")
    private String descricao;

    public Dominio(){
    }

    public Long getCodDominio() {
        return codDominio;
    }

    public void setCodDominio(Long codDominio) {
        this.codDominio = codDominio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
