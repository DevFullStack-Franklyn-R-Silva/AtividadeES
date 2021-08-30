package entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private Aluno aluno;
	private Curso curso;
	private List<Professor> professores = new ArrayList<>();

	public Disciplina(String nome, Aluno aluno, Curso curso) {
		this.nome = nome;
		this.aluno = aluno;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	// Methods
	public void listaAlunos() {

	}
}
