package com.financeiro.sistema.bean.arquivosFca;

import java.util.Date;

import com.financeiro.sistema.utils.ConverterString;
import com.opencsv.bean.CsvBindByName;

public class FcaCiaAbertaGeralBean {

    @CsvBindByName(column = "CNPJ_Companhia")
    private String cnpjCompanhia;

    @CsvBindByName(column = "Data_Referencia")
    private String dataReferencia;

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
    private String dataConstituicao;

    @CsvBindByName(column = "Codigo_CVM")
    private String codigoCvm;

    @CsvBindByName(column = "Data_Registro_CVM")
    private String dataRegistroCVM;

    @CsvBindByName(column = "Categoria_Registro_CVM")
    private String categoriaRegistroCVM;

    @CsvBindByName(column = "Data_Categoria_Registro_CVM")
    private String dataCategoriaRegistroCVM;

    @CsvBindByName(column = "Situacao_Registro_CVM")
    private String situacaoRegistroCVM;

    @CsvBindByName(column = "Data_Situacao_Registro_CVM")
    private String dataSituacaoRegistroCVM;

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
    private String dataSituacaoEmissor;

    @CsvBindByName(column = "Especie_Controle_Acionario")
    private String especieControleAcionario;

    @CsvBindByName(column = "Data_Especie_Controle_Acionario")
    private String dataEspecieControleAcionario;

    @CsvBindByName(column = "Dia_Encerramento_Exercicio_Social")
    private String diaEncerramentoExercicioSocial;

    @CsvBindByName(column = "Mes_Encerramento_Exercicio_Social")
    private String mesEncerramentoExercicioSocial;

    @CsvBindByName(column = "Data_Alteracao_Exercicio_Social")
    private String dataAlteracaoExercicioSocial;

    @CsvBindByName(column = "Pagina_Web")
    private String paginaWeb;

    public String getCnpjCompanhia() {
        return cnpjCompanhia;
    }

    public void setCnpjCompanhia(String cnpjCompanhia) {
        this.cnpjCompanhia = cnpjCompanhia;
    }

    public String getDataReferencia() {
        
        return dataReferencia;
    }

    public void setDataReferencia(String dataReferencia) {
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

    public String getDataConstituicao() {
        return dataConstituicao;
    }

    public void setDataConstituicao(String dataConstituicao) {
        this.dataConstituicao = dataConstituicao;
    }

    public String getCodigoCvm() {
        return codigoCvm;
    }

    public void setCodigoCvm(String codigoCvm) {
        this.codigoCvm = codigoCvm;
    }

    public String getDataRegistroCVM() {
        return dataRegistroCVM;
    }

    public void setDataRegistroCVM(String dataRegistroCVM) {
        this.dataRegistroCVM = dataRegistroCVM;
    }

    public String getCategoriaRegistroCVM() {
        return categoriaRegistroCVM;
    }

    public void setCategoriaRegistroCVM(String categoriaRegistroCVM) {
        this.categoriaRegistroCVM = categoriaRegistroCVM;
    }

    public String getDataCategoriaRegistroCVM() {
        return dataCategoriaRegistroCVM;
    }

    public void setDataCategoriaRegistroCVM(String dataCategoriaRegistroCVM) {
        this.dataCategoriaRegistroCVM = dataCategoriaRegistroCVM;
    }

    public String getSituacaoRegistroCVM() {
        return situacaoRegistroCVM;
    }

    public void setSituacaoRegistroCVM(String situacaoRegistroCVM) {
        this.situacaoRegistroCVM = situacaoRegistroCVM;
    }

    public String getDataSituacaoRegistroCVM() {
        return dataSituacaoRegistroCVM;
    }

    public void setDataSituacaoRegistroCVM(String dataSituacaoRegistroCVM) {
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

    public String getDataSituacaoEmissor() {
        return dataSituacaoEmissor;
    }

    public void setDataSituacaoEmissor(String dataSituacaoEmissor) {
        this.dataSituacaoEmissor = dataSituacaoEmissor;
    }

    public String getEspecieControleAcionario() {
        return especieControleAcionario;
    }

    public void setEspecieControleAcionario(String especieControleAcionario) {
        this.especieControleAcionario = especieControleAcionario;
    }

    public String getDataEspecieControleAcionario() {
        return dataEspecieControleAcionario;
    }

    public void setDataEspecieControleAcionario(String dataEspecieControleAcionario) {
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

    public String getDataAlteracaoExercicioSocial() {
        return dataAlteracaoExercicioSocial;
    }

    public void setDataAlteracaoExercicioSocial(String dataAlteracaoExercicioSocial) {
        this.dataAlteracaoExercicioSocial = dataAlteracaoExercicioSocial;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }    

    public Date getDataReferenciaFormatada() {
        return new ConverterString().converterParaData(this.dataReferencia);
    }

    public Date getDataConstituicaoFormatada() {
        return new ConverterString().converterParaData(this.dataConstituicao);
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
