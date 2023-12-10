package br.com.estagiojpa.view.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

import br.com.estagiojpa.controller.services.AlunoService;
import br.com.estagiojpa.controller.services.AvaliacaoProfessorService;
import br.com.estagiojpa.controller.services.OrientadorService;
import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Orientador;
import br.com.estagiojpa.entities.AvaliacaoDoProfessor;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.model.daos.AlunoDAO;
import br.com.estagiojpa.model.daos.AvaliacaoDoProfessorDAO;
import br.com.estagiojpa.model.daos.OrientadorDAO;

@Named
@ViewScoped
public class avaliacaoProfessorBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private AlunoService alunoService;

	@Inject
	private AlunoDAO alunoDAO;

	@Inject
	private OrientadorService orientadorService;

	@Inject
	private OrientadorDAO orientadorDAO;
	
	@Inject
	private AvaliacaoProfessorService avaliacaoService;
	
	@Inject
	private AvaliacaoDoProfessorDAO avalProfDAO;

	
	
	private List<Orientador> orientadores;
	private List<Aluno> alunosOrientados;
	private List<AvaliacaoDoProfessor> avaliacoes;


	private AvaliacaoDoProfessor avalProf = new AvaliacaoDoProfessor();
	private Aluno aluno = new Aluno();
	private Orientador orientador = new Orientador();
	
	
	@PostConstruct
	public void init() {
		this.orientadores = this.orientadorDAO.todas();
		this.avaliacoes = this.avalProfDAO.todas();
	}
	
	public void carregarAlunos() {
		FacesContext context = FacesContext.getCurrentInstance();
		try { 
			List<Aluno> alunos = this.orientadorDAO.alunosPorOrientador(this.orientador);
			this.alunosOrientados = alunos;
			PrimeFaces.current().ajax().update("form:selectAluno");
			context.addMessage(null, new FacesMessage("Busca por alunos realizada com sucesso!"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}
	
	public void avaliarAluno() {
		FacesContext context = FacesContext.getCurrentInstance();
		try { 
			this.avalProf.setAluno(this.aluno);
			this.avalProf.setOrientador(this.orientador);
			this.avaliacaoService.salvar(this.avalProf);
			
			context.addMessage(null, new FacesMessage("Avaliação feita com sucesso!"));
			
			this.avalProf = new AvaliacaoDoProfessor();
			this.aluno = new Aluno();
			this.orientador = new Orientador();
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}


	public List<Orientador> getOrientadores() {
		return orientadores;
	}


	public void setOrientadores(List<Orientador> orientadores) {
		this.orientadores = orientadores;
	}


	public List<Aluno> getAlunosOrientados() {
		return alunosOrientados;
	}


	public void setAlunosOrientados(List<Aluno> alunos) {
		this.alunosOrientados = alunos;
	}
	
	public AvaliacaoDoProfessor getAvalProf() {
		return avalProf;
	}

	public void setAvalProf(AvaliacaoDoProfessor avalProf) {
		this.avalProf = avalProf;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}

	public List<AvaliacaoDoProfessor> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<AvaliacaoDoProfessor> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
}









