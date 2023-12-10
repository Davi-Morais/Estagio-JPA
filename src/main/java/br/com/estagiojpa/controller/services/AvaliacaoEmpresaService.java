package br.com.estagiojpa.controller.services;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.AvaliacaoDaEmpresa;
import br.com.estagiojpa.entities.AvaliacaoDoProfessor;
import br.com.estagiojpa.model.daos.AvaliacaoDaEmpresaDAO;
import br.com.estagiojpa.model.daos.AvaliacaoDoProfessorDAO;
import br.com.estagiojpa.model.utils.Transactional;

public class AvaliacaoEmpresaService implements Serializable {
	@Inject
	private AvaliacaoDaEmpresaDAO avaliacaoDAO;
	
	
	@Transactional
	public void salvar(AvaliacaoDaEmpresa avaliacaoDaEmpresa) throws BusinessException {
		if (avaliacaoDaEmpresa == null) {
			throw new BusinessException("Não foi possível salvar a avaliação.");
		}
		this.avaliacaoDAO.guardar(avaliacaoDaEmpresa);
	}	
}
