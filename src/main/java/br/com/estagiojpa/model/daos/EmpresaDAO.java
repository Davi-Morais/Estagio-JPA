package br.com.estagiojpa.model.daos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.entities.Orientador;

public class EmpresaDAO implements Serializable {
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
	
	public void addAluno(Empresa empresa, Aluno aluno) {
		empresa.setAlunos(aluno);
		this.manager.merge(empresa);
	}
	
	public List<Aluno> alunosPorEmpresa(Empresa empresa) {
		Empresa empresaBusca = this.manager.find(Empresa.class, empresa.getId());
		List<Aluno> resultados = empresaBusca.getAlunos();
		
		return resultados;
	}
	
	public List<Empresa> todas() {
		TypedQuery<Empresa> query = manager.createQuery("FROM Empresa", Empresa.class);
		return query.getResultList();
	}
}
