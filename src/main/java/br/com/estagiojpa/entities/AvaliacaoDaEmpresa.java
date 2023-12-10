package br.com.estagiojpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "avaliacaoEmpresa")
public class AvaliacaoDaEmpresa implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	// Opcoes de resposta 
	// Insuficiente
    // Regular
    // Bom
    // Muito bom
	
	private String RendimentoTrabalho;
	private String Conhecimentos;
	private String CumprimentoTarefas;
	private String Aprendizagem;
	private String Desempenho;
	
	
	
	@OneToOne
    private Empresa empresa;
    
	@OneToOne
    private Aluno aluno;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRendimentoTrabalho() {
		return RendimentoTrabalho;
	}
	public void setRendimentoTrabalho(String rendimentoTrabalho) {
		RendimentoTrabalho = rendimentoTrabalho;
	}
	public String getConhecimentos() {
		return Conhecimentos;
	}
	public void setConhecimentos(String conhecimentos) {
		Conhecimentos = conhecimentos;
	}
	public String getCumprimentoTarefas() {
		return CumprimentoTarefas;
	}
	public void setCumprimentoTarefas(String cumprimentoTarefas) {
		CumprimentoTarefas = cumprimentoTarefas;
	}
	public String getAprendizagem() {
		return Aprendizagem;
	}
	public void setAprendizagem(String aprendizagem) {
		Aprendizagem = aprendizagem;
	}
	public String getDesempenho() {
		return Desempenho;
	}
	public void setDesempenho(String desempenho) {
		Desempenho = desempenho;
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
	
}
