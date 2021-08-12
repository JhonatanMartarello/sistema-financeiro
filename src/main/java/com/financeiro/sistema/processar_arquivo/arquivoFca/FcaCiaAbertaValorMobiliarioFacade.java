package com.financeiro.sistema.processar_arquivo.arquivoFca;

import java.util.List;

import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaValorMobiliarioBean;
import com.financeiro.sistema.entity.arquivosFca.FcaCiaAbertaValorMobiliarioVO;
import com.financeiro.sistema.repository.arquivosFca.FcaCiaAbertaValorMobiliarioRepository;

public class FcaCiaAbertaValorMobiliarioFacade {

    public void processarArquivoFcaCiaAbertaValorMobiliario(List<FcaCiaAbertaValorMobiliarioBean> beans){

        FcaCiaAbertaValorMobiliarioRepository fcaCiaAbertaValorMobiliarioRepository = new FcaCiaAbertaValorMobiliarioRepository();
        for(FcaCiaAbertaValorMobiliarioBean fcaCiaAbertaValorMobiliarioBean : beans){

            if(!isCiaAbertaValorImobiliarioValido(fcaCiaAbertaValorMobiliarioBean)){
               continue;
            }

            FcaCiaAbertaValorMobiliarioVO fcaCiaAbertaValorMobiliarioVO = new FcaCiaAbertaValorMobiliarioVO().parse(fcaCiaAbertaValorMobiliarioBean);
            fcaCiaAbertaValorMobiliarioRepository.persist(fcaCiaAbertaValorMobiliarioVO);
        }
    }

    public Boolean isCiaAbertaValorImobiliarioValido(FcaCiaAbertaValorMobiliarioBean bean) {
        
        if(bean.getCodigoNegociacao().isEmpty()) {
            return false;
        }

        return true;
    }
    
}
