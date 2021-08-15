package com.financeiro.sistema.processarArquivo.facade.arquivoCei;

import java.util.List;

import javax.transaction.Transactional;

import com.financeiro.sistema.facade.rendaVariavel.OperacaoRendaVariavelFacade;
import com.financeiro.sistema.processarArquivo.bean.arquivoCei.HistoricoNegociacaoCeiBean;
import com.financeiro.sistema.processarArquivo.entity.arquivoCei.HistoricoNegociacaoCeiVO;
import com.financeiro.sistema.processarArquivo.repository.arquivoCei.HistoricoNegociacaoCeiRepository;

@Transactional
public class HistoricoNegociacaoCeiFacade {
    
    public void processarArquivoHistoricoNegociacao(List<HistoricoNegociacaoCeiBean> beans){

        beans.sort((HistoricoNegociacaoCeiBean bean1, HistoricoNegociacaoCeiBean bean2) -> bean1.getDataNegocio().compareTo(bean2.getDataNegocio()));

        HistoricoNegociacaoCeiRepository historicoNegociacaoCeiRepository = new HistoricoNegociacaoCeiRepository();
        OperacaoRendaVariavelFacade operacaoRendaVariavelFacade = new OperacaoRendaVariavelFacade();
        for(HistoricoNegociacaoCeiBean bean : beans){
            HistoricoNegociacaoCeiVO vo = new HistoricoNegociacaoCeiVO().parse(bean);
            historicoNegociacaoCeiRepository.persist(vo);

            operacaoRendaVariavelFacade.calcularIncluirValorOperacao(vo);
        }
    }
}
