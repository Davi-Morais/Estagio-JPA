package br.com.estagiojpa.model.daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.AvaliacaoDaEmpresa;

public class AvaliacaoDaEmpresaDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public AvaliacaoDaEmpresaDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void addAvaliacaoDaEmpresa(AvaliacaoDaEmpresa avaliacaoDaEmpresa) {
		//manager.persist(editora);
		this.guardar(avaliacaoDaEmpresa);
	}
	
	public AvaliacaoDaEmpresa porId(Long id) {
		return manager.find(AvaliacaoDaEmpresa.class, id);
	}
	
	public AvaliacaoDaEmpresa guardar(AvaliacaoDaEmpresa avaliacaoDaEmpresa) {
		return this.manager.merge(avaliacaoDaEmpresa);
	}
	
	public void remover(AvaliacaoDaEmpresa avaliacaoDaEmpresa) {
		this.manager.remove(avaliacaoDaEmpresa);
	}
	
	public List<AvaliacaoDaEmpresa> todas() {
		TypedQuery<AvaliacaoDaEmpresa> query = manager.createQuery("FROM avaliacaoempresa", AvaliacaoDaEmpresa.class);
		return query.getResultList();
	}
}
