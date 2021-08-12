package com.financeiro.sistema.processar_arquivo.arquivoCei;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.bean.arquivoCei.HistoricoNegociacaoCeiBean;
import com.financeiro.sistema.entity.arquivoCei.HistoricoNegociacaoCeiVO;
import com.financeiro.sistema.repository.arquivoCei.HistoricoNegociacaoCeiRepository;

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
