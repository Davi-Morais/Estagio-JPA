package br.com.estagiojpa.model.daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.Empresa;

public class EmpresaDAO {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	@Inject
	public EmpresaDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void addEmpresa(Empresa empresa) {
		//manager.persist(editora);
		this.guardar(empresa);
	}
	
	public Empresa porId(Long id) {
		return manager.find(Empresa.class, id);
	}
	
	public Empresa guardar(Empresa empresa) {
		return this.manager.merge(empresa);
	}
	
	public void remover(Empresa empresa) {
		this.manager.remove(empresa);
	}
	
	public List<Empresa> todas() {
		TypedQuery<Empresa> query = manager.createQuery("FROM Empresas", Empresa.class);
		return query.getResultList();
	}
}
