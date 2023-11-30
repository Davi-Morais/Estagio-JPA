package br.com.estagiojpa.controller.services;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.estagiojpa.model.daos.AlunoDAO;
import br.com.estagiojpa.model.utils.Transactional;
import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.Aluno;

public class AlunoService implements Serializable {
	
	@Inject
	private AlunoDAO alunoDAO;
	
	@Transactional
	public void salvar(Aluno aluno) throws BusinessException {
		if (aluno == null) {
			throw new BusinessException("Não foi possível salvar o Aluno.");
		}
		this.alunoDAO.guardar(aluno);
	}
	
	
	@Transactional
	public void excluir(Aluno aluno) throws BusinessException {
		aluno = this.alunoDAO.porId(aluno.getId());
		if (aluno == null) {
			throw new BusinessException("Não é possível excluir o Aluno!");
		}
		this.alunoDAO.remover(aluno);
	}

}
