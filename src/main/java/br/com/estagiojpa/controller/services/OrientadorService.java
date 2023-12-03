package br.com.estagiojpa.controller.services;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Orientador;
import br.com.estagiojpa.model.daos.AlunoDAO;
import br.com.estagiojpa.model.daos.OrientadorDAO;
import br.com.estagiojpa.model.utils.Transactional;

public class OrientadorService implements Serializable {
	@Inject
	private OrientadorDAO orientadorDAO;
	@Inject
	private AlunoDAO alunoDAO;
	
	@Transactional
	public void salvar(Orientador orientador) throws BusinessException {
		if (orientador == null) {
			throw new BusinessException("Não foi possível salvar o Orientador.");
		}
		this.orientadorDAO.guardar(orientador);
	}
	
	
	@Transactional
	public void excluir(Orientador orientador) throws BusinessException {
		orientador = this.orientadorDAO.porId(orientador.getId());
		if (orientador == null) {
			throw new BusinessException("Não é possível excluir o Orientador!");
		}
		this.orientadorDAO.remover(orientador);
	}
	
	@Transactional
	public void addAluno(Orientador orientador, Aluno aluno) throws BusinessException {
		orientador = this.orientadorDAO.porId(orientador.getId());
		aluno = this.alunoDAO.porId(aluno.getId());
		if (orientador == null || aluno == null) {
			throw new BusinessException("Não foi possível adicionar o Aluno.");
		}
		this.orientadorDAO.addAluno(orientador, aluno);
	}
}
