package com.financeiro.sistema.entity.arquivosFca;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fca_cia_aberta_escriturador")
public class FcaCiaAbertaEscrituradorVO {
    @Id
    @Column(name = "cae_cnpj_companhia")
    private Long cnpjCompanhia;

    @Column(name = "cae_data_referencia")
    private Date dataReferencia;

    @Column(name = "cae_id_documento")
    private Long idDocumento;

    @Column(name = "cae_escriturador")
    private String escriturador;

    @Column(name = "car_cnpj_escriturador")
    private Long cnpjEscriturador;

    public FcaCiaAbertaEscrituradorVO() {

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

    public String getEscriturador() {
        return escriturador;
    }

    public void setEscriturador(String escriturador) {
        this.escriturador = escriturador;
    }

    public Long getCnpjEscriturador() {
        return cnpjEscriturador;
    }

    public void setCnpjEscriturador(Long cnpjEscriturador) {
        this.cnpjEscriturador = cnpjEscriturador;
    }

    
}
