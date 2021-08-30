package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private Faculdade faculdade;
	private Professor coordena;
	private List<Professor> lotado = new ArrayList<>();
	
	public Departamento() {
	}
	public Departamento(String nome, Faculdade faculdade, Professor coordena) {
		this.nome = nome;
		this.faculdade = faculdade;
		this.coordena = coordena;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Faculdade getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}
	public Professor getCoordena() {
		return coordena;
	}
	public void setCoordena(Professor coordena) {
		this.coordena = coordena;
	}
	public List<Professor> getLotado() {
		return lotado;
	}
	
}
