package entities;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

	private String nome;
	private Pessoa pessoa;
	private List<Departamento> departamento = new ArrayList<>();

	public Faculdade(String nome, Pessoa pessoa) {
		this.nome = nome;
		this.pessoa = pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Departamento> getDepartamento() {
		return departamento;
	}

}
