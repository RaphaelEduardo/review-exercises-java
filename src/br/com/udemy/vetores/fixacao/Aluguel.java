package br.com.udemy.vetores.fixacao;

public class Aluguel {
	
	public String nome;
	public String email;
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return  nome + ", " + email;
	}
	
}
