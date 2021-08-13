package com.financeiro.sistema.processarArquivo.bean.arquivoFca;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class FcaCiaAbertaValorMobiliarioBean {
    @CsvBindByName(column = "CNPJ_Companhia")
    private String cnpjCompanhia;

    @CsvBindByName(column = "Data_Referencia")
    @CsvDate("yyyy-MM-dd")
    private Date dataReferencia;

    @CsvBindByName(column = "Versao")
    private int versao;

    @CsvBindByName(column = "ID_Documento")
    private String idDocumento;

    @CsvBindByName(column = "Valor_Mobiliario")
    private String valorMobiliario;

    @CsvBindByName(column = "Sigla_Classe_Acao_Preferencial")
    private String siglaClasseAcaoPreferencial;

    @CsvBindByName(column = "Classe_Acao_Preferencial")
    private String classeAcaoPreferencial;

    @CsvBindByName(column = "Codigo_Negociacao")
    private String codigoNegociacao;

    @CsvBindByName(column = "Composicao_BDR_Unit")
    private String composicaoBdrUnit;

    @CsvBindByName(column = "Mercado")
    private String mercado;

    @CsvBindByName(column = "Sigla_Entidade_Administradora")
    private String siglaEntidadeAdministradora;

    @CsvBindByName(column = "Entidade_Administradora")
    private String entidadeAdministradora;

    @CsvBindByName(column = "Data_Inicio_Negociacao")
    @CsvDate("yyyy-MM-dd")
    private Date dataInicioNegociacao;

    @CsvBindByName(column = "Data_Fim_Negociacao")
    @CsvDate("yyyy-MM-dd")
    private Date dataFimNegociacao;

    @CsvBindByName(column = "Segmento")
    private String segmento;

    @CsvBindByName(column = "Data_Inicio_Listagem")
    @CsvDate("yyyy-MM-dd")
    private Date dataInicioListagem;

    @CsvBindByName(column = "Data_Fim_Listagem")
    @CsvDate("yyyy-MM-dd")
    private Date setorAtividade;

    public String getCnpjCompanhia() {
        return cnpjCompanhia;
    }

    public void setCnpjCompanhia(String cnpjCompanhia) {
        this.cnpjCompanhia = cnpjCompanhia;
    }

    public Date getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(Date dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getValorMobiliario() {
        return valorMobiliario;
    }

    public void setValorMobiliario(String valorMobiliario) {
        this.valorMobiliario = valorMobiliario;
    }

    public String getSiglaClasseAcaoPreferencial() {
        return siglaClasseAcaoPreferencial;
    }

    public void setSiglaClasseAcaoPreferencial(String siglaClasseAcaoPreferencial) {
        this.siglaClasseAcaoPreferencial = siglaClasseAcaoPreferencial;
    }

    public String getClasseAcaoPreferencial() {
        return classeAcaoPreferencial;
    }

    public void setClasseAcaoPreferencial(String classeAcaoPreferencial) {
        this.classeAcaoPreferencial = classeAcaoPreferencial;
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

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getSiglaEntidadeAdministradora() {
        return siglaEntidadeAdministradora;
    }

    public void setSiglaEntidadeAdministradora(String siglaEntidadeAdministradora) {
        this.siglaEntidadeAdministradora = siglaEntidadeAdministradora;
    }

    public String getEntidadeAdministradora() {
        return entidadeAdministradora;
    }

    public void setEntidadeAdministradora(String entidadeAdministradora) {
        this.entidadeAdministradora = entidadeAdministradora;
    }

    public Date getDataInicioNegociacao() {
        return dataInicioNegociacao;
    }

    public void setDataInicioNegociacao(Date dataInicioNegociacao) {
        this.dataInicioNegociacao = dataInicioNegociacao;
    }

    public Date getDataFimNegociacao() {
        return dataFimNegociacao;
    }

    public void setDataFimNegociacao(Date dataFimNegociacao) {
        this.dataFimNegociacao = dataFimNegociacao;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public Date getDataInicioListagem() {
        return dataInicioListagem;
    }

    public void setDataInicioListagem(Date dataInicioListagem) {
        this.dataInicioListagem = dataInicioListagem;
    }

    public Date getSetorAtividade() {
        return setorAtividade;
    }

    public void setSetorAtividade(Date setorAtividade) {
        this.setorAtividade = setorAtividade;
    }

    
}
