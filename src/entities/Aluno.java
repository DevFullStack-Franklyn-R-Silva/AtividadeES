package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private String nome;
	private String mat;
	private List<Curso> curso = new ArrayList<>();
	private Disciplina estuda;

	public Aluno(String nome, String cpf, Faculdade faculdade, String nome2, String mat, Disciplina estuda) {
		super(nome, cpf, faculdade);
		nome = nome2;
		this.mat = mat;
		this.estuda = estuda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public Disciplina getEstuda() {
		return estuda;
	}

	public void setEstuda(Disciplina estuda) {
		this.estuda = estuda;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	// Methods
	public boolean add(Disciplina d) {
		boolean a = true;
		return a;
	}
	
}
