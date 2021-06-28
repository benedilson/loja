package br.com.loja.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.loja.entidade.Loja;

@Stateless
public class LojaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Loja> listar() {
		return entityManager.createQuery("SELECT l FROM Loja l", Loja.class).getResultList();
	}
	
	public void inserir(Loja loja) {
		entityManager.persist(loja);
	}
	
}
