package br.com.sistema.model;

public class Cliente {
private String nome;
private String telefone;
private String email;
private Cidade cidade;

public Cliente (String nome){
this.nome= nome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Cidade getCidade() {
	return cidade;
}

public void setCidade(Cidade c) {
	this.cidade = c;
}

@Override
public String toString() {
	return "Cliente [nome=" + this.nome + ", telefone=" + this.telefone + ", email=" + this.email +"\ncidade=" + this.cidade + "]";
}

















}

