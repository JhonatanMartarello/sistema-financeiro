package com.financeiro.sistema.entity.arquivosFca;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaGeralBean;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_fca_cia_aberta_geral")
public class FcaCiaAbertaGeralVO extends PanacheEntityBase{
    @Id
    @Column(name = "cag_cnpj_companhia")
    private Long cnpjCompanhia;

    @Column(name = "cag_data_referencia")
    private Date dataReferencia;

    @Column(name = "cag_id_documento")
    private Long idDocumento;

    @Column(name = "cag_nome_empresarial")
    private String nomeEmpresarial;

    @Column(name = "cag_data_constituicao")
    private Date dataConstituicao;

    @Column(name = "cag_codigo_cvm")
    private Long codigoCvm;

    @Column(name = "cag_setor_atividade")
    private String setorAtividade;

    @Column(name = "cag_descricao_atividade")
    private String descricaoAtividade;

    @Column(name = "cag_pagina_web")
    private String paginaWeb;

    public FcaCiaAbertaGeralVO(){

    }

    public Long getCnpjCompanhia() {
        return cnpjCompanhia;
    }

    public void setCnpjCompanhia(Long cnpjCompanhia) {
        this.cnpjCompanhia = cnpjCompanhia;
    }

    public Date getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(Date dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public Long getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public Date getDataConstituicao() {
        return dataConstituicao;
    }

    public void setDataConstituicao(Date dataConstituicao) {
        this.dataConstituicao = dataConstituicao;
    }

    public Long getCodigoCvm() {
        return codigoCvm;
    }

    public void setCodigoCvm(Long codigoCvm) {
        this.codigoCvm = codigoCvm;
    }

    public String getSetorAtividade() {
        return setorAtividade;
    }

    public void setSetorAtividade(String setorAtividade) {
        this.setorAtividade = setorAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }


    public FcaCiaAbertaGeralVO parse(FcaCiaAbertaGeralBean bean) {
        FcaCiaAbertaGeralVO fcaCiaAbertaGeralVO = new FcaCiaAbertaGeralVO();
        fcaCiaAbertaGeralVO.setCnpjCompanhia(bean.getCnpjCompanhiaFormatada());
        fcaCiaAbertaGeralVO.setDataReferencia(bean.getDataReferenciaFormatada());
        fcaCiaAbertaGeralVO.setIdDocumento(bean.getIdDocumentoFormatada());
        fcaCiaAbertaGeralVO.setNomeEmpresarial(bean.getNomeEmpresarial());
        fcaCiaAbertaGeralVO.setDataConstituicao(bean.getDataConstituicaoFormatada());
        fcaCiaAbertaGeralVO.setCodigoCvm(bean.getCodigoCvmFormatada());
        fcaCiaAbertaGeralVO.setSetorAtividade(bean.getSetorAtividade());
        fcaCiaAbertaGeralVO.setDescricaoAtividade(bean.getDescricaoAtividade());
        fcaCiaAbertaGeralVO.setPaginaWeb(bean.getPaginaWeb());

        return fcaCiaAbertaGeralVO;
    }
    
}
