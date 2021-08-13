package com.financeiro.sistema.repository.rendaVariavel;

import javax.enterprise.context.ApplicationScoped;

import com.financeiro.sistema.entity.rendaVariavel.OperacaoRendaVariavelVO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OperacaoRendaVariavelRepository implements PanacheRepository<OperacaoRendaVariavelVO>{
    
    public void incluir(OperacaoRendaVariavelVO operacaoRendaVariavelVO) {
        operacaoRendaVariavelVO.persist();
    }
}
