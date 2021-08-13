package com.financeiro.sistema.processarArquivo.facade.arquivoFca;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.processarArquivo.bean.arquivoFca.FcaCiaAbertaGeralBean;
import com.financeiro.sistema.processarArquivo.entity.arquivoFca.FcaCiaAbertaGeralVO;
import com.financeiro.sistema.processarArquivo.repository.arquivoFca.FcaCiaAbertaGeralRepository;

@Transactional
public class FcaCiaAbertaGeralFacade {

    public void processarArquivoFcaCiaAbertaGeral(List<FcaCiaAbertaGeralBean> beans){

        FcaCiaAbertaGeralRepository fcaCiaAbertaGeralRepository = new FcaCiaAbertaGeralRepository();
        for(FcaCiaAbertaGeralBean fcaCiaAbertaGeralBean : beans){
            FcaCiaAbertaGeralVO fcaCiaAbertaGeralVO = new FcaCiaAbertaGeralVO().parse(fcaCiaAbertaGeralBean);
            fcaCiaAbertaGeralRepository.persist(fcaCiaAbertaGeralVO);
        }
    }
}
