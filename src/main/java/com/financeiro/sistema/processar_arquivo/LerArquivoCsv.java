package com.financeiro.sistema.processar_arquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaGeralBean;
import com.financeiro.sistema.processar_arquivo.arquivos.FcaCiaAbertaGeralFacade;
import com.opencsv.bean.CsvToBeanBuilder;

public class LerArquivoCsv {

    final String FCA_CIA_ABERTA_GERAL = "fca_cia_aberta_geral_2021.csv";
    final String FCA_CIA_ABERTA_VALOR_IMOBILIARIO = "fca_cia_aberta_valor_mobiliario_2021";

    public void lerArquivoCsv(String nomeArquivo) {

        try {
            String pathArquivo = "D:\\Usuários\\Jhonatan\\Documents\\dadosBolsa\\dados_acao\\fca_cia_aberta_2021\\"
                    + nomeArquivo;
    
            if (FCA_CIA_ABERTA_GERAL.equals(nomeArquivo)) {
                List<FcaCiaAbertaGeralBean> beans = new CsvToBeanBuilder(new FileReader(pathArquivo))
                        .withType(FcaCiaAbertaGeralBean.class).build().parse();
                new FcaCiaAbertaGeralFacade().processarArquivoFcaCiaAbertaGeral(beans);
            } else if(FCA_CIA_ABERTA_VALOR_IMOBILIARIO.equals(nomeArquivo)){
                
            }

        } catch (IllegalStateException | FileNotFoundException e) {
            System.out.println("Error" + e.getStackTrace());
        }

    }



    

}
