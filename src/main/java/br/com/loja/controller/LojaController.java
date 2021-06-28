package br.com.loja.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.loja.entidade.Loja;
import br.com.loja.service.LojaService;

@Path("lojas")
public class LojaController {

	private final int CRIADO = 201;
	
	@Inject
	private LojaService lojaService;
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response listar() {
		return Response.ok(lojaService.listar()).build();
	}
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response buscarPorCNPJ(Loja loja) {
		return Response.ok(lojaService.buscarPorCNPJ(loja)).build();
	}
	
	@POST
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response inserir(Loja loja) {
		lojaService.inserir(loja);
		return Response.status(CRIADO).build();
	}
	
	@PUT
	@Consumes(value = MediaType.APPLICATION_JSON)
	public Response atualizar(Loja loja) {
		lojaService.atualizar(loja);
		return Response.status(CRIADO).build();
	}
	
	
}
