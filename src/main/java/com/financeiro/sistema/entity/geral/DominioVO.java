package com.financeiro.sistema.entity.geral;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_dominio")
public class DominioVO extends PanacheEntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dom_cod_dominio")
    private Long codDominio;

    @Column(name = "dom_descricao")
    private String descricao;

    @OneToMany(mappedBy = "codDominio")
    private List<RegistroVO> listaRegistro;

    public DominioVO(){
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

    public List<RegistroVO> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(List<RegistroVO> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }
    
    
    
}
