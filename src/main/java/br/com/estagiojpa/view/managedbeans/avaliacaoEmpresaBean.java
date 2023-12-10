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
import br.com.estagiojpa.controller.services.AvaliacaoEmpresaService;
import br.com.estagiojpa.controller.services.AvaliacaoProfessorService;
import br.com.estagiojpa.controller.services.EmpresaService;
import br.com.estagiojpa.controller.services.OrientadorService;
import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.entities.AvaliacaoDaEmpresa;
import br.com.estagiojpa.entities.AvaliacaoDoProfessor;
import br.com.estagiojpa.entities.Empresa;
import br.com.estagiojpa.entities.Orientador;
import br.com.estagiojpa.model.daos.AlunoDAO;
import br.com.estagiojpa.model.daos.AvaliacaoDaEmpresaDAO;
import br.com.estagiojpa.model.daos.AvaliacaoDoProfessorDAO;
import br.com.estagiojpa.model.daos.EmpresaDAO;
import br.com.estagiojpa.model.daos.OrientadorDAO;

@Named
@ViewScoped
public class avaliacaoEmpresaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private AlunoService alunoService;

	@Inject
	private AlunoDAO alunoDAO;

	@Inject
	private EmpresaService empresaService;

	@Inject
	private EmpresaDAO empresaDAO;
	
	@Inject
	private AvaliacaoEmpresaService avaliacaoEmpresaService;
	
	@Inject
	private AvaliacaoDaEmpresaDAO avalEmpresaDAO;
	
	
	private List<Empresa> empresas;
	private List<Aluno> alunosEmpresa;
	
	private AvaliacaoDaEmpresa avalEmpresa = new AvaliacaoDaEmpresa();
	private Aluno aluno = new Aluno();
	private Empresa empresa = new Empresa();
	
	
	@PostConstruct
	public void init() {
		this.empresas = this.empresaDAO.todas();
	}
	
	public void carregarAlunos() {
		FacesContext context = FacesContext.getCurrentInstance();
		try { 
			List<Aluno> alunos = this.empresaDAO.alunosPorEmpresa(this.empresa);
			this.alunosEmpresa = alunos;
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
			this.avalEmpresa.setAluno(this.aluno);
			this.avalEmpresa.setEmpresa(this.empresa);
			this.avaliacaoEmpresaService.salvar(this.avalEmpresa);
			
			context.addMessage(null, new FacesMessage("Avaliação feita com sucesso!"));
			
			this.avalEmpresa = new AvaliacaoDaEmpresa();
			this.aluno = new Aluno();
			this.empresa = new Empresa();
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Aluno> getAlunosEmpresa() {
		return alunosEmpresa;
	}

	public void setAlunosEmpresa(List<Aluno> alunosEmpresa) {
		this.alunosEmpresa = alunosEmpresa;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public AvaliacaoDaEmpresa getAvalEmpresa() {
		return avalEmpresa;
	}

	public void setAvalEmpresa(AvaliacaoDaEmpresa avalEmpresa) {
		this.avalEmpresa = avalEmpresa;
	}
	
	
}








