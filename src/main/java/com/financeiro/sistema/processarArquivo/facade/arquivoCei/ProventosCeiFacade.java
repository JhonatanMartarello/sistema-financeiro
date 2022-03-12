package com.financeiro.sistema.processarArquivo.facade.arquivoCei;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.constantes.Constantes;
import com.financeiro.sistema.processarArquivo.bean.arquivoCei.ProventosCeiBean;
import com.financeiro.sistema.processarArquivo.entity.arquivoCei.ProventosCeiVO;
import com.financeiro.sistema.processarArquivo.repository.arquivoCei.ProventosCeiRepository;

@Transactional
public class ProventosCeiFacade {
    public void processarArquivoProventosCei(List<ProventosCeiBean> beans){

        beans.sort((ProventosCeiBean bean1, ProventosCeiBean bean2) -> bean1.getDataProvento().compareTo(bean2.getDataProvento()));

        ProventosCeiRepository proventosCeiRepository = new ProventosCeiRepository();
        for(ProventosCeiBean bean : beans){
            ProventosCeiVO vo = new ProventosCeiVO().parse(bean);
            if(vo.getTipoMovimentacao() != null && Constantes.MOVIMENTACAO_RENDIMENTO.equals(vo.getTipoMovimentacao().getCodRegistro())) {
                proventosCeiRepository.persist(vo);
            }
        }
    }
}
