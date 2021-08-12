package com.financeiro.sistema.processar_arquivo.arquivoFca;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.bean.arquivosFca.FcaCiaAbertaEscrituradorBean;
import com.financeiro.sistema.entity.arquivosFca.FcaCiaAbertaEscrituradorVO;
import com.financeiro.sistema.repository.arquivosFca.FcaCiaAbertaEscrituradorRepository;

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
