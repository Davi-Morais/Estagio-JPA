package br.com.estagiojpa.model.daos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.Aluno;



public class AlunoDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public AlunoDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void addAluno(Aluno aluno) {
		//manager.persist(editora);
		this.guardar(aluno);
	}
	
	public Aluno porId(Long id) {
		return manager.find(Aluno.class, id);
	}
	
	public Aluno guardar(Aluno aluno) {
		return this.manager.merge(aluno);
	}
	
	public void remover(Aluno aluno) {
		this.manager.remove(aluno);
	}
	
	public List<Aluno> todas() {
		TypedQuery<Aluno> query = manager.createQuery("FROM Alunos", Aluno.class);
		return query.getResultList();
	}
}
