package com.financeiro.sistema.entity.arquivosFca;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaEscrituradorBean;
import com.financeiro.sistema.utils.ConverterString;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tb_fca_cia_aberta_escriturador")
public class FcaCiaAbertaEscrituradorVO extends PanacheEntityBase {

    @Embeddable
    public class FcaCiaAbertaEscrituradorId implements Serializable {

        @Column(name = "cae_cnpj_companhia")
        private Long cnpjCompanhia;

        @Column(name = "cae_cnpj_escriturador")
        private Long cnpjEscriturador;

        public FcaCiaAbertaEscrituradorId() {
        }

        public Long getCnpjCompanhia() {
            return cnpjCompanhia;
        }

        public void setCnpjCompanhia(Long cnpjCompanhia) {
            this.cnpjCompanhia = cnpjCompanhia;
        }

        public Long getCnpjEscriturador() {
            return cnpjEscriturador;
        }

        public void setCnpjEscriturador(Long cnpjEscriturador) {
            this.cnpjEscriturador = cnpjEscriturador;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((cnpjCompanhia == null) ? 0 : cnpjCompanhia.hashCode());
            result = prime * result + ((cnpjEscriturador == null) ? 0 : cnpjEscriturador.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            FcaCiaAbertaEscrituradorId other = (FcaCiaAbertaEscrituradorId) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (cnpjCompanhia == null) {
                if (other.cnpjCompanhia != null)
                    return false;
            } else if (!cnpjCompanhia.equals(other.cnpjCompanhia))
                return false;
            if (cnpjEscriturador == null) {
                if (other.cnpjEscriturador != null)
                    return false;
            } else if (!cnpjEscriturador.equals(other.cnpjEscriturador))
                return false;
            return true;
        }

        private FcaCiaAbertaEscrituradorVO getEnclosingInstance() {
            return FcaCiaAbertaEscrituradorVO.this;
        }
    }

    @EmbeddedId
    private FcaCiaAbertaEscrituradorId idComposto;

    @Column(name = "cae_data_referencia")
    private Date dataReferencia;

    @Column(name = "cae_id_documento")
    private Long idDocumento;

    @Column(name = "cae_escriturador")
    private String escriturador;    

    public FcaCiaAbertaEscrituradorVO() {

    }
    
    public FcaCiaAbertaEscrituradorId getIdComposto() {
        return idComposto;
    }

    public void setIdComposto(FcaCiaAbertaEscrituradorId idComposto) {
        this.idComposto = idComposto;
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

    public FcaCiaAbertaEscrituradorVO parse(FcaCiaAbertaEscrituradorBean bean) {

        ConverterString converterString = new ConverterString();

        FcaCiaAbertaEscrituradorVO fcaCiaAbertaEscrituradorVO = new FcaCiaAbertaEscrituradorVO();

        FcaCiaAbertaEscrituradorId fcaCiaAbertaEscrituradorId = new FcaCiaAbertaEscrituradorId();

        fcaCiaAbertaEscrituradorId.setCnpjCompanhia(converterString.converterParaLong(bean.getCnpjCompanhia()));
        fcaCiaAbertaEscrituradorId.setCnpjEscriturador(converterString.converterParaLong(bean.getCnpjEscriturador()));
        fcaCiaAbertaEscrituradorVO.setIdComposto(fcaCiaAbertaEscrituradorId);
        fcaCiaAbertaEscrituradorVO.setDataReferencia(converterString.converterParaData(bean.getDataReferencia()));
        fcaCiaAbertaEscrituradorVO.setIdDocumento(converterString.converterParaLong(bean.getIdDocumento()));
        fcaCiaAbertaEscrituradorVO.setEscriturador(bean.getEscriturador());

        return fcaCiaAbertaEscrituradorVO;
    }

}
