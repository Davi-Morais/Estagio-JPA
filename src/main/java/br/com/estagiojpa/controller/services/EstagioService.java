package br.com.estagiojpa.controller.services;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.Estagio;
import br.com.estagiojpa.model.daos.EstagioDAO;
import br.com.estagiojpa.model.utils.Transactional;

public class EstagioService implements Serializable {
	@Inject
	private EstagioDAO empresaDAO;
	
	@Transactional
	public void salvar(Estagio estagio) throws BusinessException {
		if (estagio == null) {
			throw new BusinessException("Não foi possível salvar o estagio.");
		}
		this.empresaDAO.guardar(estagio);
	}	
}
