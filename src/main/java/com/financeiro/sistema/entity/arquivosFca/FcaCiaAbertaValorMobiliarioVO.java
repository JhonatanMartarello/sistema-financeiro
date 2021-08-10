package com.financeiro.sistema.entity.arquivosFca;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaValorMobiliarioBean;
import com.financeiro.sistema.utils.ConverterString;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_fca_cia_aberta_valor_mobiliario")
public class FcaCiaAbertaValorMobiliarioVO extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avm_id")
    private Long id;

    @Column(name = "avm_cnpj_companhia")
    private Long cnpjCompanhia;

    @Column(name = "avm_data_referencia")
    private Date dataReferencia;

    @Column(name = "avm_id_documento")
    private Long idDocumento;

    @Column(name = "avm_valor_mobiliario")
    private String valorMobiliario;

    @Column(name = "avm_codigo_negociacao")
    private String codigoNegociacao;

    @Column(name = "avm_composicao_bdr_unit")
    private String composicaoBdrUnit;

    @Column(name = "avm_data_inicio_negociacao")
    private Date dataInicioNegociacao;

    @Column(name = "avm_segmento")
    private String segmento;

    public FcaCiaAbertaValorMobiliarioVO() {

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

    public String getValorMobiliario() {
        return valorMobiliario;
    }

    public void setValorMobiliario(String valorMobiliario) {
        this.valorMobiliario = valorMobiliario;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }

    public String getComposicaoBdrUnit() {
        return composicaoBdrUnit;
    }

    public void setComposicaoBdrUnit(String composicaoBdrUnit) {
        this.composicaoBdrUnit = composicaoBdrUnit;
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

    public FcaCiaAbertaValorMobiliarioVO parse(FcaCiaAbertaValorMobiliarioBean bean) {
        
        ConverterString converterString = new ConverterString();

        FcaCiaAbertaValorMobiliarioVO fcaCiaAbertaValorMobiliarioVO = new FcaCiaAbertaValorMobiliarioVO();

        fcaCiaAbertaValorMobiliarioVO.setCnpjCompanhia(converterString.converterParaLong(bean.getCnpjCompanhia()));
        fcaCiaAbertaValorMobiliarioVO.setDataReferencia(converterString.converterParaData(bean.getDataReferencia()));
        fcaCiaAbertaValorMobiliarioVO.setIdDocumento(converterString.converterParaLong(bean.getIdDocumento()));
        fcaCiaAbertaValorMobiliarioVO.setCodigoNegociacao(bean.getCodigoNegociacao());
        fcaCiaAbertaValorMobiliarioVO.setValorMobiliario(bean.getValorMobiliario());
        fcaCiaAbertaValorMobiliarioVO.setComposicaoBdrUnit(bean.getComposicaoBdrUnit());
        fcaCiaAbertaValorMobiliarioVO.setDataInicioNegociacao(converterString.converterParaData(bean.getDataInicioNegociacao()));
        fcaCiaAbertaValorMobiliarioVO.setSegmento(bean.getSegmento());

        return fcaCiaAbertaValorMobiliarioVO;
    }

}
