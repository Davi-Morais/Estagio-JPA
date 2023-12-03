package br.com.estagiojpa.controller.services;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.estagiojpa.controller.exceptions.BusinessException;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.model.daos.EmpresaDAO;
import br.com.estagiojpa.model.utils.Transactional;



public class EmpresaService implements Serializable {
	@Inject
	private EmpresaDAO empresaDAO;
	
	@Transactional
	public void salvar(Empresa empresa) throws BusinessException {
		if (empresa == null) {
			throw new BusinessException("Não foi possível salvar a Empresa.");
		}
		this.empresaDAO.guardar(empresa);
	}
	
	
	@Transactional
	public void excluir(Empresa empresa) throws BusinessException {
		empresa = this.empresaDAO.porId(empresa.getId());
		if (empresa == null) {
			throw new BusinessException("Não é possível excluir a Empresa!");
		}
		this.empresaDAO.remover(empresa);
	}
}
