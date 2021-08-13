package com.financeiro.sistema.processarArquivo.facade.arquivoCei;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.processarArquivo.bean.arquivoCei.HistoricoNegociacaoCeiBean;
import com.financeiro.sistema.processarArquivo.entity.arquivoCei.HistoricoNegociacaoCeiVO;
import com.financeiro.sistema.processarArquivo.repository.arquivoCei.HistoricoNegociacaoCeiRepository;

@Transactional
public class HistoricoNegociacaoCeiFacade {
    
    public void processarArquivoHistoricoNegociacao(List<HistoricoNegociacaoCeiBean> beans){

        HistoricoNegociacaoCeiRepository historicoNegociacaoCeiRepository = new HistoricoNegociacaoCeiRepository();
        for(HistoricoNegociacaoCeiBean bean : beans){
            HistoricoNegociacaoCeiVO vo = new HistoricoNegociacaoCeiVO().parse(bean);
            historicoNegociacaoCeiRepository.persist(vo);
        }
    }
}
