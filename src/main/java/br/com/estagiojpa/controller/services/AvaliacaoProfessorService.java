package br.com.estagiojpa.controller.services;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.AvaliacaoDoProfessor;
import br.com.estagiojpa.model.daos.AvaliacaoDoProfessorDAO;
import br.com.estagiojpa.model.utils.Transactional;

public class AvaliacaoProfessorService implements Serializable {
	@Inject
	private AvaliacaoDoProfessorDAO avaliacaoDAO;
	
	
	@Transactional
	public void salvar(AvaliacaoDoProfessor avaliacaoDoProfessor) throws BusinessException {
		if (avaliacaoDoProfessor == null) {
			throw new BusinessException("Não foi possível salvar a avaliação.");
		}
		this.avaliacaoDAO.guardar(avaliacaoDoProfessor);
	}	
}
