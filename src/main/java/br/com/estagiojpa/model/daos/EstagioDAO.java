package br.com.estagiojpa.model.daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.Estagio;

public class EstagioDAO {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public EstagioDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void addEstagio(Estagio estagio) {
		//manager.persist(editora);
		this.guardar(estagio);
	}
	
	public Estagio porId(Long id) {
		return manager.find(Estagio.class, id);
	}
	
	public Estagio guardar(Estagio estagio) {
		return this.manager.merge(estagio);
	}
	
	public void remover(Estagio estagio) {
		this.manager.remove(estagio);
	}
	
	public List<Estagio> todas() {
		TypedQuery<Estagio> query = manager.createQuery("FROM Estagios", Estagio.class);
		return query.getResultList();
	}
	
}
