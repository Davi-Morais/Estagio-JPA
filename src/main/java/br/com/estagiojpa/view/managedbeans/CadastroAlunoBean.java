package br.com.estagiojpa.view.managedbeans;

import java.io.Serializable;
import java.util.List;
 
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.estagiojpa.controller.services.AlunoService;
import br.com.estagiojpa.entities.Aluno;
import br.com.estagiojpa.model.daos.AlunoDAO;


@Named
@ViewScoped
public class CadastroAlunoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AlunoService alunoService;
	
	@Inject
	private AlunoDAO alunoDAO;
	
	private Aluno aluno = new Aluno();
	
	private List<Aluno> alunos;
	
	
	public void salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			this.alunoService.salvar(this.aluno);
			this.aluno = new Aluno();
			context.addMessage(null, new FacesMessage("Aluno criado com sucesso!"));
		} catch (Exception e) {
			FacesMessage mensagem = new FacesMessage(e.getMessage());
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
	}
	
	public void listarAlunos() {
		 this.alunos = alunoDAO.todas();
	}

	public Aluno getEditora() {
		return aluno;
	}
	
	
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
