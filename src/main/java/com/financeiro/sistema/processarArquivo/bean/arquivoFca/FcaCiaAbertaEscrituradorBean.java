package com.financeiro.sistema.processarArquivo.bean.arquivoFca;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class FcaCiaAbertaEscrituradorBean {
    
    @CsvBindByName(column = "CNPJ_Companhia")
    private String cnpjCompanhia;

    @CsvBindByName(column = "Data_Referencia")
    @CsvDate("yyyy-MM-dd")
    private Date dataReferencia;

    @CsvBindByName(column = "Versao")
    private int versao;

    @CsvBindByName(column = "ID_Documento")
    private String idDocumento;

    @CsvBindByName(column = "Escriturador")
    private String escriturador;

    @CsvBindByName(column = "CNPJ_Escriturador")
    private String cnpjEscriturador;

    @CsvBindByName(column = "Tipo_Endereco")
    private String tipoEndereco;

    @CsvBindByName(column = "Logradouro")
    private String logradouro;

    @CsvBindByName(column = "Complemento")
    private String complemento;

    @CsvBindByName(column = "Bairro")
    private String bairro;

    @CsvBindByName(column = "Cidade")
    private String cidade;

    @CsvBindByName(column = "Sigla_UF")
    private String siglaUf;

    @CsvBindByName(column = "Pais")
    private String pais;

    @CsvBindByName(column = "CEP")
    private String cep;

    @CsvBindByName(column = "DDI_Telefone")
    private String ddiTelefone;

    @CsvBindByName(column = "DDD_Telefone")
    private String dddTelefone;

    @CsvBindByName(column = "Telefone")
    private String telefone;

    @CsvBindByName(column = "DDI_Fax")
    private String ddiFax;

    @CsvBindByName(column = "DDD_Fax")
    private String dddFax;

    @CsvBindByName(column = "Fax")
    private String fax;
    
    @CsvBindByName(column = "Email")
    private String email;

    @CsvBindByName(column = "Data_Inicio_Atuacao")
    @CsvDate("yyyy-MM-dd")
    private Date dataInicioAtuacao;

    @CsvBindByName(column = "Data_Fim_Atuacao")
    @CsvDate("yyyy-MM-dd")
    private Date dataFimAtuacao;

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

    public String getEscriturador() {
        return escriturador;
    }

    public void setEscriturador(String escriturador) {
        this.escriturador = escriturador;
    }

    public String getCnpjEscriturador() {
        return cnpjEscriturador;
    }

    public void setCnpjEscriturador(String cnpjEscriturador) {
        this.cnpjEscriturador = cnpjEscriturador;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDdiTelefone() {
        return ddiTelefone;
    }

    public void setDdiTelefone(String ddiTelefone) {
        this.ddiTelefone = ddiTelefone;
    }

    public String getDddTelefone() {
        return dddTelefone;
    }

    public void setDddTelefone(String dddTelefone) {
        this.dddTelefone = dddTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDdiFax() {
        return ddiFax;
    }

    public void setDdiFax(String ddiFax) {
        this.ddiFax = ddiFax;
    }

    public String getDddFax() {
        return dddFax;
    }

    public void setDddFax(String dddFax) {
        this.dddFax = dddFax;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataInicioAtuacao() {
        return dataInicioAtuacao;
    }

    public void setDataInicioAtuacao(Date dataInicioAtuacao) {
        this.dataInicioAtuacao = dataInicioAtuacao;
    }

    public Date getDataFimAtuacao() {
        return dataFimAtuacao;
    }

    public void setDataFimAtuacao(Date dataFimAtuacao) {
        this.dataFimAtuacao = dataFimAtuacao;
    }

    
    
}
