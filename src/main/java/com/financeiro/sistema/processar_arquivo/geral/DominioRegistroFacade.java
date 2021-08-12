package com.financeiro.sistema.processar_arquivo.geral;

import com.financeiro.sistema.entity.geral.RegistroVO;

public class DominioRegistroFacade {

    public RegistroVO carregarRegistroPelaDescricao(String descricao) {
        return RegistroVO.find("descricao", descricao).firstResult();        
    }
    
}
