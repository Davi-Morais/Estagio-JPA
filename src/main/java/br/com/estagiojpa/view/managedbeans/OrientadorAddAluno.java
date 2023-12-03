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

import br.com.estagiojpa.controller.services.AlunoService;
import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.model.daos.AlunoDAO;

@Named
@ViewScoped
public class OrientadorAddAluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private OrientadorService orientadorService;
	
	@Inject
	private OrientadorDAO orientadorDAO;
	@Inject
	private AlunoDAO alunoDAO;
	
	private Orientador orientador = new Orientador();
	private Aluno aluno = new Aluno();
	
	private List<Orientador> orientadores;
	private List<Aluno> alunos;
	
	@PostConstruct
	public void init() {
		this.orientadores = this.orientadorDAO.todas();
		this.alunos = this.alunoDAO.todas();
	}
	
	public void adicionarAluno() {
		FacesContext context = FacesContext.getCurrentInstance();
		try { 
			this.orientadorService.addAluno(orientador, aluno);
			this.orientador = new Orientador();
			this.aluno = new Aluno();
			context.addMessage(null, new FacesMessage("Aluno adicionado ao Orientador escolhidos"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}

	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Orientador> getOrientadores() {
		return orientadores;
	}

	public void setOrientadores(List<Orientador> orientadores) {
		this.orientadores = orientadores;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
