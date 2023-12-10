package br.com.estagiojpa.model.daos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.AvaliacaoDoProfessor;

public class AvaliacaoDoProfessorDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public AvaliacaoDoProfessorDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void addAvaliacaoDoProfessor(AvaliacaoDoProfessor avaliacaoDoProfessor) {
		//manager.persist(editora);
		this.guardar(avaliacaoDoProfessor);
	}
	
	public AvaliacaoDoProfessor porId(Long id) {
		return manager.find(AvaliacaoDoProfessor.class, id);
	}
	
	public AvaliacaoDoProfessor guardar(AvaliacaoDoProfessor avaliacaoDoProfessor) {
		return this.manager.merge(avaliacaoDoProfessor);
	}
	
	public void remover(AvaliacaoDoProfessor avaliacaoDoProfessor) {
		this.manager.remove(avaliacaoDoProfessor);
	}
	
	public List<AvaliacaoDoProfessor> todas() {
		TypedQuery<AvaliacaoDoProfessor> query = manager.createQuery("FROM avaliacaoprofessor", AvaliacaoDoProfessor.class);
		return query.getResultList();
	}
	
}
