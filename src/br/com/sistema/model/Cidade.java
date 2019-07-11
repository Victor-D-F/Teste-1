package br.com.sistema.model;

public class Cidade {
	private String nomeCidade;
	private String uf;
	public Cidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		return "Cidade [nomeCidade=" + this.nomeCidade + ", uf=" + this.uf + "]";
	}
	
	
	
}
