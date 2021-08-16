package com.financeiro.sistema.facade.geral;

import com.financeiro.sistema.entity.geral.RegistroVO;
import com.financeiro.sistema.repository.geral.RegistroRepository;

public class DominioRegistroFacade {

    public RegistroVO carregarRegistroPelaDescricao(String descricao) {
        return new RegistroRepository().carregarRegistroPelaDescricao(descricao);
    }

    public RegistroVO carregarRegistroPeloDominioRegistro(Long codDominio, Long codRegistro) {
        return new RegistroRepository().carregarRegistroPeloDominioRegistro(codDominio, codRegistro);
    }

}
