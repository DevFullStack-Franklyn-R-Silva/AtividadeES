package entities;

public class Pessoa {
	private String nome;
	private String cpf;
	private Faculdade faculdade;

	public Pessoa(String nome, String cpf, Faculdade faculdade) {
		this.nome = nome;
		this.cpf = cpf;
		this.faculdade = faculdade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Faculdade getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}

}
