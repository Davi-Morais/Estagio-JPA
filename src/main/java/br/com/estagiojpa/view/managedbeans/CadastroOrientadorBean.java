package br.com.estagiojpa.view.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.estagiojpa.controller.services.OrientadorService;
import br.com.estagiojpa.entities.Orientador;
import br.com.estagiojpa.model.daos.OrientadorDAO;

@Named
@ViewScoped
public class CadastroOrientadorBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private OrientadorService orientadorService;
	
	@Inject
	private OrientadorDAO orientadorDAO;
	
	private Orientador orientador = new Orientador();
	
	private List<Orientador> orientadores;
	
	
	@PostConstruct
	public void init() {
		this.orientadores = this.orientadorDAO.todas();
	}
	
	public void salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			this.orientadorService.salvar(this.orientador);
			this.orientador = new Orientador();
			context.addMessage(null, new FacesMessage("Orientador criado com sucesso!"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}
	
	
	public void listarOrientadores() {
		 this.orientadores = orientadorDAO.todas();
	}


	public Orientador getOrientador() {
		return orientador;
	}


	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}


	public List<Orientador> getOrientadores() {
		return orientadores;
	}


	public void setOrientadores(List<Orientador> orientadores) {
		this.orientadores = orientadores;
	}
	
	
}







