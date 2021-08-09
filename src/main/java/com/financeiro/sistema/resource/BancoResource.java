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

import com.financeiro.sistema.entity.cliente.BancoVO;
import com.financeiro.sistema.repository.cliente.BancoRepository;

@Path("/bancos")
@Transactional
public class BancoResource {
    
    @Inject
    BancoRepository bancoRepository;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<BancoVO> buscarBancos(){
        return bancoRepository.buscarTodos();
    }

    @POST
    @Path("/incluir")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response incluirBanco(BancoVO banco){
        bancoRepository.incluir(banco);
        return Response.ok(banco).build();
    }

    @PUT
    @Path("/alterar")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response alterarBanco(BancoVO banco){
        BancoVO bancoEntity = bancoRepository.alterar(banco);
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
