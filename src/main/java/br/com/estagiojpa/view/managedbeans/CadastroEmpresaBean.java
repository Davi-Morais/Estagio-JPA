package br.com.estagiojpa.view.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.estagiojpa.controller.services.EmpresaService;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.model.daos.EmpresaDAO;



@Named
@ViewScoped
public class CadastroEmpresaBean implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Inject
	private EmpresaService empresaService;
	
	@Inject
	private EmpresaDAO empresaDAO;
	
	private Empresa empresa = new Empresa();
	
	private List<Empresa> empresas;
	
	
	@PostConstruct
	public void init() {
		this.empresas = this.empresaDAO.todas();
	}
	
	public void salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			this.empresaService.salvar(this.empresa);
			this.empresa = new Empresa();
			context.addMessage(null, new FacesMessage("Empresa criada com sucesso!"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}
	
	public void listarEmpresas() {
		 this.empresas = empresaDAO.todas();
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	
}
