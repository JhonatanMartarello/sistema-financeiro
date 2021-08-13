package com.financeiro.sistema.processarArquivo.facade.arquivoFca;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.processarArquivo.bean.arquivoFca.FcaCiaAbertaEscrituradorBean;
import com.financeiro.sistema.processarArquivo.entity.arquivoFca.FcaCiaAbertaEscrituradorVO;
import com.financeiro.sistema.processarArquivo.repository.arquivoFca.FcaCiaAbertaEscrituradorRepository;

@Transactional
public class FcaCiaAbertaEscrituradorFacade {

    public void processarArquivoFcaCiaAbertaEscriturador(List<FcaCiaAbertaEscrituradorBean> beans){

        FcaCiaAbertaEscrituradorRepository fcaCiaAbertaEscrituradorRepository = new FcaCiaAbertaEscrituradorRepository();
        for(FcaCiaAbertaEscrituradorBean fcaCiaAbertaEscrituradorlBean : beans){
            FcaCiaAbertaEscrituradorVO fcaCiaAbertaGeralVO = new FcaCiaAbertaEscrituradorVO().parse(fcaCiaAbertaEscrituradorlBean);
            fcaCiaAbertaEscrituradorRepository.persist(fcaCiaAbertaGeralVO);
        }
    }
}
