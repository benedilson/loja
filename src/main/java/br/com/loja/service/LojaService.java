package br.com.loja.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.loja.dao.LojaDAO;
import br.com.loja.entidade.Loja;

@Stateless
public class LojaService {

	@Inject
	private LojaDAO lojaDAO;
	
	public List<Loja> listar() {
		return lojaDAO.listar(); 
	}
	
	public void inserir(Loja loja) {
		lojaDAO.inserir(loja);
	}
	
	public void atualizar(Loja loja) {
		lojaDAO.atualizar(loja);
	}
	
	public Loja buscarPorCNPJ(Loja loja) {
		return lojaDAO.buscarPorCNPJ(loja);
	}
	
}
