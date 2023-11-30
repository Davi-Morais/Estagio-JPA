package br.com.estagiojpa.controller.services;

import javax.inject.Inject;

import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.Orientador;
import br.com.estagiojpa.model.daos.OrientadorDAO;
import br.com.estagiojpa.model.utils.Transactional;

public class OrientadorService {
	@Inject
	private OrientadorDAO orientadorDAO;
	
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
}
