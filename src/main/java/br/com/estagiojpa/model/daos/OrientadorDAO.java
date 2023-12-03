package br.com.estagiojpa.model.daos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Orientador;

public class OrientadorDAO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public OrientadorDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void addOrientador(Orientador orientador) {
		//manager.persist(editora);
		this.guardar(orientador);
	}
	
	public Orientador porId(Long id) {
		return manager.find(Orientador.class, id);
	}
	
	public Orientador guardar(Orientador orientador) {
		return this.manager.merge(orientador);
	}
	
	public void remover(Orientador orientador) {
		this.manager.remove(orientador);
	}
	
	public void addAluno(Orientador orientador, Aluno aluno) {
		orientador.setAluno(aluno);
		this.manager.merge(orientador);
	}
	
	public List<Orientador> todas() {
		TypedQuery<Orientador> query = manager.createQuery("FROM Orientador", Orientador.class);
		return query.getResultList();
	}
	
	
}
