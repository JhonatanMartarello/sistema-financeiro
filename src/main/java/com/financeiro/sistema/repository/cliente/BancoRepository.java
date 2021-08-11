package com.financeiro.sistema.repository.cliente;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.financeiro.sistema.entity.cliente.BancoVO;
import com.financeiro.sistema.processar_arquivo.LerArquivoCsv;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BancoRepository implements PanacheRepository<BancoVO>{
    
    public List<BancoVO> buscarTodos (){
        LerArquivoCsv lerArquivoCsv = new LerArquivoCsv();
        // lerArquivoCsv.lerArquivoCsv("fca_cia_aberta_geral_2021.csv");
        // lerArquivoCsv.lerArquivoCsv("fca_cia_aberta_valor_mobiliario_2021.csv");
        lerArquivoCsv.lerArquivoCsv("fca_cia_aberta_escriturador_2021.csv");

        return BancoVO.listAll();
    }
    
    public BancoVO encontrarPorNumeroDocumento(Long numeroDocumento){        
        return BancoVO.findById(numeroDocumento);
    }

    public void excluir (Long id){
        BancoVO bancoEntity = this.encontrarPorNumeroDocumento(id);

        if(bancoEntity == null){
            throw new WebApplicationException("Banco não encontrado!", Response.Status.NOT_FOUND);
        }

        bancoEntity.delete();
    }
    
    public void incluir (BancoVO banco){
        banco.persist();
    }

    public BancoVO alterar (BancoVO banco){
        BancoVO bancoEntity = this.encontrarPorNumeroDocumento(banco.getNumeroDocumento());

        if(bancoEntity == null){
            throw new WebApplicationException("Banco não encontrado!", Response.Status.NOT_FOUND);
        }

        bancoEntity.setNome(banco.getNome()); 
        return bancoEntity;  
    }
}
