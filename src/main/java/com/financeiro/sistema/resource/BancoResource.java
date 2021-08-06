package com.financeiro.sistema.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.financeiro.sistema.entity.Banco;
import com.financeiro.sistema.repository.BancoRepository;

@Path("/bancos")
@Transactional
public class BancoResource {
    
    @Inject
    BancoRepository bancoRepository;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Banco> buscarBancos(){
        return bancoRepository.buscarTodos();
    }

    @POST
    @Path("/incluir")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response incluirBanco(Banco banco){
        bancoRepository.incluir(banco);
        return Response.ok(banco).build();
    }

    @PUT
    @Path("/alterar")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response alterarBanco(Banco banco){
        Banco bancoEntity = bancoRepository.alterar(banco);
        return Response.ok(bancoEntity).build();
    }


    @DELETE
    @Path("/excluir/{id}")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response excluirBanco(@PathParam("id") Long id){
        bancoRepository.excluir(id);
        return Response.status(204).build();
    }
}
