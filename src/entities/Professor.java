package entities;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	private String mat;
	private List<Curso> curso = new ArrayList<>();
	private Departamento coordena;
	private List<Departamento> lotado = new ArrayList<>();
	private Disciplina[] ministra;

	public void Disciplina() {
		ministra = new Disciplina[2];
	}

	public Professor(String nome, String cpf, Faculdade faculdade, String mat, Departamento coordena,
			entities.Disciplina[] ministra) {
		super(nome, cpf, faculdade);
		this.mat = mat;
		this.coordena = coordena;
		this.ministra = ministra;
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public Departamento getCoordena() {
		return coordena;
	}

	public void setCoordena(Departamento coordena) {
		this.coordena = coordena;
	}

	public Disciplina[] getMinistra() {
		return ministra;
	}

	public void setMinistra(Disciplina[] ministra) {
		this.ministra = ministra;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	public List<Departamento> getLotado() {
		return lotado;
	}

}
