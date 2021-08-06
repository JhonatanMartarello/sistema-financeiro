package com.financeiro.sistema.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.financeiro.sistema.entity.Banco;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BancoRepository implements PanacheRepository<Banco>{
    
    public List<Banco> buscarTodos (){
        return Banco.listAll();
    }
    
    public Banco encontrarPorNumeroDocumento(Long numeroDocumento){        
        return Banco.findById(numeroDocumento);
    }

    public void excluir (Long id){
        Banco bancoEntity = this.encontrarPorNumeroDocumento(id);

        if(bancoEntity == null){
            throw new WebApplicationException("Banco não encontrado!", Response.Status.NOT_FOUND);
        }

        bancoEntity.delete();
    }
    
    public void incluir (Banco banco){
        banco.persist();
    }

    public Banco alterar (Banco banco){
        Banco bancoEntity = this.encontrarPorNumeroDocumento(banco.getNumeroDocumento());

        if(bancoEntity == null){
            throw new WebApplicationException("Banco não encontrado!", Response.Status.NOT_FOUND);
        }

        bancoEntity.setNome(banco.getNome()); 
        return bancoEntity;  
    }
}
