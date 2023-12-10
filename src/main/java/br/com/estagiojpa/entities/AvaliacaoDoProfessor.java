package br.com.estagiojpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "avaliacaoProfessor")
public class AvaliacaoDoProfessor implements Serializable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	// Opcoes de resposta 
	// Insuficiente
    // Regular
    // Bom
    // Muito bom
	
	private String Assiduidade;
	private String Disciplina;
	private String Sociabilidade;
	private String Responsabilidade;
	private String Iniciativa;
	
	
	@OneToOne
    private Aluno aluno;
    
	@OneToOne
    private Orientador orientador;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAssiduidade() {
		return Assiduidade;
	}
	public void setAssiduidade(String assiduidade) {
		Assiduidade = assiduidade;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	public String getSociabilidade() {
		return Sociabilidade;
	}
	public void setSociabilidade(String sociabilidade) {
		Sociabilidade = sociabilidade;
	}
	public String getResponsabilidade() {
		return Responsabilidade;
	}
	public void setResponsabilidade(String responsabilidade) {
		Responsabilidade = responsabilidade;
	}
	public String getIniciativa() {
		return Iniciativa;
	}
	public void setIniciativa(String iniciativa) {
		Iniciativa = iniciativa;
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
	
}