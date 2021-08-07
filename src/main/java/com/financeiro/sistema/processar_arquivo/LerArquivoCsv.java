package com.financeiro.sistema.processar_arquivo;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class LerArquivoCsv {

    public void lerArquivoCsv(){

        try {
            String pathArquivo = "D:\\Usuários\\Jhonatan\\Documents\\dadosBolsa\\dados_acao\\cad_cia_aberta.csv";    
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(pathArquivo)).withSkipLines(1).build();
            
            List<String[]> linhas = csvReader.readAll();

            for(String[] linha : linhas){
                for(String coluna : linha){
                    System.out.println(coluna + " # ");
                }
            }
            

        } catch(IOException | CsvException e){
            System.out.println("Arquivo não encontrado!");
        }
    }
    
}
