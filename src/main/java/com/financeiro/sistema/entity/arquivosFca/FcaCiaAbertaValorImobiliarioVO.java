package com.financeiro.sistema.entity.arquivosFca;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_fca_cia_aberta_valor_imobiliario")
public class FcaCiaAbertaValorImobiliarioVO extends PanacheEntityBase {
    @Id
    @Column(name = "avi_cnpj_companhia")
    private Long cnpjCompanhia;

    @Column(name = "avi_data_referencia")
    private Date dataReferencia;

    @Column(name = "avi_id_documento")
    private Long idDocumento;

    @Column(name = "avi_valor_imobiliario")
    private String valorImobiliario;

    @Column(name = "avi_codigo_negociacao")
    private String codigoNegociacao;

    @Column(name = "avi_composicao_unit")
    private String composicao_unit;

    @Column(name = "avi_data_inicio_negociacao")
    private Date dataInicioNegociacao;

    @Column(name = "avi_segmento")
    private String segmento;

    public FcaCiaAbertaValorImobiliarioVO() {

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

    public String getValorImobiliario() {
        return valorImobiliario;
    }

    public void setValorImobiliario(String valorImobiliario) {
        this.valorImobiliario = valorImobiliario;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }

    public String getComposicao_unit() {
        return composicao_unit;
    }

    public void setComposicao_unit(String composicao_unit) {
        this.composicao_unit = composicao_unit;
    }

    public Date getDataInicioNegociacao() {
        return dataInicioNegociacao;
    }

    public void setDataInicioNegociacao(Date dataInicioNegociacao) {
        this.dataInicioNegociacao = dataInicioNegociacao;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

}
