package entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<>();
	private Disciplina disciplinas;

	public Curso(String nome, Professor professor, Disciplina disciplinas) {
		this.nome = nome;
		this.professor = professor;
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

}
