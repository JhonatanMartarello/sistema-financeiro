package com.financeiro.sistema.processar_arquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.financeiro.sistema.bean.arquivoCei.HistoricoNegociacaoCeiBean;
import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaEscrituradorBean;
import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaGeralBean;
import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaValorMobiliarioBean;
import com.financeiro.sistema.processar_arquivo.arquivoCei.HistoricoNegociacaoCeiFacade;
import com.financeiro.sistema.processar_arquivo.arquivoFca.FcaCiaAbertaEscrituradorFacade;
import com.financeiro.sistema.processar_arquivo.arquivoFca.FcaCiaAbertaGeralFacade;
import com.financeiro.sistema.processar_arquivo.arquivoFca.FcaCiaAbertaValorMobiliarioFacade;
import com.opencsv.bean.CsvToBeanBuilder;

public class LerArquivoCsv {

    final String FCA_CIA_ABERTA_GERAL = "fca_cia_aberta_geral_2021.csv";
    final String FCA_CIA_ABERTA_VALOR_MOBILIARIO = "fca_cia_aberta_valor_mobiliario_2021.csv";
    final String FCA_CIA_ABERTA_ESCRITURADOR = "fca_cia_aberta_escriturador_2021.csv";
    final String NEGOCIACAO_CEI = "negociacao_cei_2021.csv";

    final String PATH_ARQUIVO_FCA = "D:\\Usuários\\Jhonatan\\Documents\\dadosBolsa\\dados_acao\\fca_cia_aberta_2021\\";
    final String PATH_ARQUIVO_CEI = "D:\\Usuários\\Jhonatan\\Documents\\dadosBolsa\\dados_acao\\historico_cei_2021\\";

    public void lerArquivoCsv(String nomeArquivo) {

        if (FCA_CIA_ABERTA_GERAL.equals(nomeArquivo)) {

            List<FcaCiaAbertaGeralBean> beans = this.arquivoCsvParaBean(FcaCiaAbertaGeralBean.class,
                    PATH_ARQUIVO_FCA + nomeArquivo);
            new FcaCiaAbertaGeralFacade().processarArquivoFcaCiaAbertaGeral(beans);

        } else if (FCA_CIA_ABERTA_VALOR_MOBILIARIO.equals(nomeArquivo)) {

            List<FcaCiaAbertaValorMobiliarioBean> beans = this.arquivoCsvParaBean(FcaCiaAbertaValorMobiliarioBean.class,
                    PATH_ARQUIVO_FCA + nomeArquivo);
            new FcaCiaAbertaValorMobiliarioFacade().processarArquivoFcaCiaAbertaValorMobiliario(beans);

        } else if (FCA_CIA_ABERTA_ESCRITURADOR.equals(nomeArquivo)) {

            List<FcaCiaAbertaEscrituradorBean> beans = this.arquivoCsvParaBean(FcaCiaAbertaEscrituradorBean.class,
                    PATH_ARQUIVO_FCA + nomeArquivo);
            new FcaCiaAbertaEscrituradorFacade().processarArquivoFcaCiaAbertaEscriturador(beans);

        } else if (NEGOCIACAO_CEI.equals(nomeArquivo)) {

            List<HistoricoNegociacaoCeiBean> beans = this.arquivoCsvParaBean(HistoricoNegociacaoCeiBean.class,
                    PATH_ARQUIVO_CEI + nomeArquivo);
            new HistoricoNegociacaoCeiFacade().processarArquivoHistoricoNegociacao(beans);

        }
    }

    public <T> List<T> arquivoCsvParaBean(Class<T> T, String caminhoArquivo) {
        try {
            List<T> beans = new CsvToBeanBuilder(new FileReader(caminhoArquivo)).withSeparator(';').withType(T).build()
                    .parse();

            return beans;

        } catch (IllegalStateException | FileNotFoundException e) {
            System.out.println("Error" + e.getStackTrace());
        }

        return null;

    }

}
