package br.com.estagiojpa.view.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.estagiojpa.controller.services.EstagioService;
import br.com.estagiojpa.entities.Estagio;
import br.com.estagiojpa.model.daos.EstagioDAO;

@Named
@ViewScoped
public class CadastroEstagioBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EstagioService estagioService;
	@Inject
	private EstagioDAO estagioDAO;
	
	
	private Estagio estagio = new Estagio();
	
	private List<Estagio> estagios;
	
	@PostConstruct
	public void init() {
		this.estagios = this.estagioDAO.todas();
	}
	
	public void salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			this.estagioService.salvar(this.estagio);
			this.estagio = new Estagio();
			context.addMessage(null, new FacesMessage("Estagio criado com sucesso!"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}
	
	public void listarOrientadores() {
		 this.estagios = estagioDAO.todas();
	}

	public Estagio getEstagio() {
		return estagio;
	}

	public void setEstagio(Estagio estagio) {
		this.estagio = estagio;
	}

	public List<Estagio> getEstagios() {
		return estagios;
	}

	public void setEstagios(List<Estagio> estagios) {
		this.estagios = estagios;
	}
	
	
}













