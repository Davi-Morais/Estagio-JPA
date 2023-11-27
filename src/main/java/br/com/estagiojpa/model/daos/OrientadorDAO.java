package br.com.estagiojpa.model.daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.Orientador;

public class OrientadorDAO {
	
	
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
	
	public List<Orientador> todas() {
		TypedQuery<Orientador> query = manager.createQuery("FROM Orientadores", Orientador.class);
		return query.getResultList();
	}
	
	
}
