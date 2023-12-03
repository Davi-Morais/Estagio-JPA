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
import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.entities.Orientador;
import br.com.estagiojpa.model.daos.AlunoDAO;
import br.com.estagiojpa.model.daos.EmpresaDAO;

@Named
@ViewScoped
public class EmpresaAddAluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EmpresaService empresaService;

	@Inject
	private EmpresaDAO empresaDAO;
	@Inject
	private AlunoDAO alunoDAO;

	private Empresa empresa = new Empresa();
	private Aluno aluno = new Aluno();

	private List<Empresa> empresas;
	private List<Aluno> alunos;
	
	
	@PostConstruct
	public void init() {
		this.empresas = this.empresaDAO.todas();
		this.alunos = this.alunoDAO.todas();
	}
	
	public void adicionarAluno() {
		FacesContext context = FacesContext.getCurrentInstance();
		try { 
			this.empresaService.addAluno(empresa, aluno);
			this.empresa = new Empresa();
			this.aluno = new Aluno();
			context.addMessage(null, new FacesMessage("Aluno adicionado a Empresa escolhida"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}












