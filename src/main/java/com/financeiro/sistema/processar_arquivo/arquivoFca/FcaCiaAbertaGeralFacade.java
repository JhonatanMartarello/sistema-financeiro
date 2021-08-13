package com.financeiro.sistema.processar_arquivo.arquivoFca;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.bean.arquivoFca.FcaCiaAbertaGeralBean;
import com.financeiro.sistema.entity.arquivoFca.FcaCiaAbertaGeralVO;
import com.financeiro.sistema.repository.arquivoFca.FcaCiaAbertaGeralRepository;

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
