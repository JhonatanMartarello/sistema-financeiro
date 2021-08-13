package com.financeiro.sistema.processarArquivo.facade.arquivoFca;

import java.util.List;

import com.financeiro.sistema.processarArquivo.bean.arquivoFca.FcaCiaAbertaValorMobiliarioBean;
import com.financeiro.sistema.processarArquivo.entity.arquivoFca.FcaCiaAbertaValorMobiliarioVO;
import com.financeiro.sistema.processarArquivo.repository.arquivoFca.FcaCiaAbertaValorMobiliarioRepository;

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
