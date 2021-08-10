package com.financeiro.sistema.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverterString {

    public Long converterParaLong(String campo){
        Long campoConvertido = null;
        try{
            campoConvertido = campo == null ? null : Long.parseLong(campo.replaceAll("[^0-9]+", ""));
        }catch (NumberFormatException e){
            System.out.println("Erro ao converterParaLong: " + e);
        }
        return campoConvertido;
    }

    public Date converterParaData(String campo) {
        Date campoConvertido = null;
        try {
            if(campo == null || campo.isEmpty()){
                return null;
            }

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            campoConvertido = formato.parse(campo);        
        } catch (ParseException e) {
            System.out.println("Erro ao converterParaData: " + e);
        }
        return campoConvertido;
    }    
}
