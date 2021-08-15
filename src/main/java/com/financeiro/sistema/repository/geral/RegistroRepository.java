package com.financeiro.sistema.repository.geral;

import com.financeiro.sistema.entity.geral.RegistroVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class RegistroRepository implements PanacheRepository<RegistroVO> {

    public RegistroVO carregarRegistroPelaDescricao(String descricao) {
        return RegistroVO.find("descricao", descricao).firstResult();
    }

    public RegistroVO carregarRegistroPeloDominioRegistro(Integer codDominio, Integer codRegistro) {
        return (RegistroVO) RegistroVO.find(
                "FROM RegistroVO re where re.codDominio = :codDominio and re.codRegistro = :codRegistro ", codDominio,
                codRegistro);
    }

}
