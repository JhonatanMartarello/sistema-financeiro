package com.financeiro.sistema.processarArquivo.bean.arquivoFca;

import java.util.Date;

import com.financeiro.sistema.utils.ConverterString;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class FcaCiaAbertaGeralBean {

    @CsvBindByName(column = "CNPJ_Companhia")
    private String cnpjCompanhia;

    @CsvBindByName(column = "Data_Referencia")
    @CsvDate("yyyy-MM-dd")
    private Date dataReferencia;

    @CsvBindByName(column = "Versao")
    private int versao;

    @CsvBindByName(column = "ID_Documento")
    private String idDocumento;

    @CsvBindByName(column = "Nome_Empresarial")
    private String nomeEmpresarial;

    @CsvBindByName(column = "Data_Nome_Empresarial")
    private String dataNomeEmpresarial;

    @CsvBindByName(column = "Nome_Empresarial_Anterior")
    private String nomeEmpresarialAnterior;

    @CsvBindByName(column = "Data_Constituicao")
    @CsvDate("yyyy-MM-dd")
    private Date dataConstituicao;

    @CsvBindByName(column = "Codigo_CVM")
    private String codigoCvm;

    @CsvBindByName(column = "Data_Registro_CVM")
    @CsvDate("yyyy-MM-dd")
    private Date dataRegistroCVM;

    @CsvBindByName(column = "Categoria_Registro_CVM")
    private String categoriaRegistroCVM;

    @CsvBindByName(column = "Data_Categoria_Registro_CVM")
    @CsvDate("yyyy-MM-dd")
    private Date dataCategoriaRegistroCVM;

    @CsvBindByName(column = "Situacao_Registro_CVM")
    private String situacaoRegistroCVM;

    @CsvBindByName(column = "Data_Situacao_Registro_CVM")
    @CsvDate("yyyy-MM-dd")
    private Date dataSituacaoRegistroCVM;

    @CsvBindByName(column = "Pais_Origem")
    private String paisOrigem;

    @CsvBindByName(column = "Pais_Custodia_Valores_Mobiliarios")
    private String paisCustodiaValoresMobiliarios;

    @CsvBindByName(column = "Setor_Atividade")
    private String setorAtividade;

    @CsvBindByName(column = "Descricao_Atividade")
    private String descricaoAtividade;

    @CsvBindByName(column = "Situacao_Emissor")
    private String situacaoEmissor;

    @CsvBindByName(column = "Data_Situacao_Emissor")
    @CsvDate("yyyy-MM-dd")
    private Date dataSituacaoEmissor;

    @CsvBindByName(column = "Especie_Controle_Acionario")
    private String especieControleAcionario;

    @CsvBindByName(column = "Data_Especie_Controle_Acionario")
    @CsvDate("yyyy-MM-dd")
    private Date dataEspecieControleAcionario;

    @CsvBindByName(column = "Dia_Encerramento_Exercicio_Social")
    private String diaEncerramentoExercicioSocial;

    @CsvBindByName(column = "Mes_Encerramento_Exercicio_Social")
    private String mesEncerramentoExercicioSocial;

    @CsvBindByName(column = "Data_Alteracao_Exercicio_Social")
    @CsvDate("yyyy-MM-dd")
    private Date dataAlteracaoExercicioSocial;

    @CsvBindByName(column = "Pagina_Web")
    private String paginaWeb;

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

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public String getDataNomeEmpresarial() {
        return dataNomeEmpresarial;
    }

    public void setDataNomeEmpresarial(String dataNomeEmpresarial) {
        this.dataNomeEmpresarial = dataNomeEmpresarial;
    }

    public String getNomeEmpresarialAnterior() {
        return nomeEmpresarialAnterior;
    }

    public void setNomeEmpresarialAnterior(String nomeEmpresarialAnterior) {
        this.nomeEmpresarialAnterior = nomeEmpresarialAnterior;
    }

    public Date getDataConstituicao() {
        return dataConstituicao;
    }

    public void setDataConstituicao(Date dataConstituicao) {
        this.dataConstituicao = dataConstituicao;
    }

    public String getCodigoCvm() {
        return codigoCvm;
    }

    public void setCodigoCvm(String codigoCvm) {
        this.codigoCvm = codigoCvm;
    }

    public Date getDataRegistroCVM() {
        return dataRegistroCVM;
    }

    public void setDataRegistroCVM(Date dataRegistroCVM) {
        this.dataRegistroCVM = dataRegistroCVM;
    }

    public String getCategoriaRegistroCVM() {
        return categoriaRegistroCVM;
    }

    public void setCategoriaRegistroCVM(String categoriaRegistroCVM) {
        this.categoriaRegistroCVM = categoriaRegistroCVM;
    }

    public Date getDataCategoriaRegistroCVM() {
        return dataCategoriaRegistroCVM;
    }

    public void setDataCategoriaRegistroCVM(Date dataCategoriaRegistroCVM) {
        this.dataCategoriaRegistroCVM = dataCategoriaRegistroCVM;
    }

    public String getSituacaoRegistroCVM() {
        return situacaoRegistroCVM;
    }

    public void setSituacaoRegistroCVM(String situacaoRegistroCVM) {
        this.situacaoRegistroCVM = situacaoRegistroCVM;
    }

    public Date getDataSituacaoRegistroCVM() {
        return dataSituacaoRegistroCVM;
    }

    public void setDataSituacaoRegistroCVM(Date dataSituacaoRegistroCVM) {
        this.dataSituacaoRegistroCVM = dataSituacaoRegistroCVM;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getPaisCustodiaValoresMobiliarios() {
        return paisCustodiaValoresMobiliarios;
    }

    public void setPaisCustodiaValoresMobiliarios(String paisCustodiaValoresMobiliarios) {
        this.paisCustodiaValoresMobiliarios = paisCustodiaValoresMobiliarios;
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

    public String getSituacaoEmissor() {
        return situacaoEmissor;
    }

    public void setSituacaoEmissor(String situacaoEmissor) {
        this.situacaoEmissor = situacaoEmissor;
    }

    public Date getDataSituacaoEmissor() {
        return dataSituacaoEmissor;
    }

    public void setDataSituacaoEmissor(Date dataSituacaoEmissor) {
        this.dataSituacaoEmissor = dataSituacaoEmissor;
    }

    public String getEspecieControleAcionario() {
        return especieControleAcionario;
    }

    public void setEspecieControleAcionario(String especieControleAcionario) {
        this.especieControleAcionario = especieControleAcionario;
    }

    public Date getDataEspecieControleAcionario() {
        return dataEspecieControleAcionario;
    }

    public void setDataEspecieControleAcionario(Date dataEspecieControleAcionario) {
        this.dataEspecieControleAcionario = dataEspecieControleAcionario;
    }

    public String getDiaEncerramentoExercicioSocial() {
        return diaEncerramentoExercicioSocial;
    }

    public void setDiaEncerramentoExercicioSocial(String diaEncerramentoExercicioSocial) {
        this.diaEncerramentoExercicioSocial = diaEncerramentoExercicioSocial;
    }

    public String getMesEncerramentoExercicioSocial() {
        return mesEncerramentoExercicioSocial;
    }

    public void setMesEncerramentoExercicioSocial(String mesEncerramentoExercicioSocial) {
        this.mesEncerramentoExercicioSocial = mesEncerramentoExercicioSocial;
    }

    public Date getDataAlteracaoExercicioSocial() {
        return dataAlteracaoExercicioSocial;
    }

    public void setDataAlteracaoExercicioSocial(Date dataAlteracaoExercicioSocial) {
        this.dataAlteracaoExercicioSocial = dataAlteracaoExercicioSocial;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }    

    public Long getCnpjCompanhiaFormatada() {
        return new ConverterString().converterParaLong(this.cnpjCompanhia);
    }

    public Long getIdDocumentoFormatada() {
        return new ConverterString().converterParaLong(this.idDocumento);
    }

    public Long getCodigoCvmFormatada() {
        return new ConverterString().converterParaLong(this.codigoCvm);
    }
    
}
