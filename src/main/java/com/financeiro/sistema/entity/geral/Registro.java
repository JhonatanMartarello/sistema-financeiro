package com.financeiro.sistema.entity.geral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_registro")
public class Registro extends PanacheEntityBase{

    @Id
    @Column(name = "reg_id_registro")
    private Long idRegistro;

    @ManyToOne
    @JoinColumn(name = "reg_cod_dominio")
    private Dominio codDominio;

    @Column(name = "reg_cod_registro")
    private Long codRegistro;
    
    @Column(name = "reg_descricao")
    private String descricao;

    @Column(name = "reg_complemento")
    private String complemento;

    public Registro(){
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Dominio getCodDominio() {
        return codDominio;
    }

    public void setCodDominio(Dominio codDominio) {
        this.codDominio = codDominio;
    }

    public Long getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(Long codRegistro) {
        this.codRegistro = codRegistro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    

}
