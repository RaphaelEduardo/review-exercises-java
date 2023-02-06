package br.com.udemy.poo.introducao.ex3;

public class Aluno {

	public double nota1;
	public double nota2;
	public double nota3;
	
	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double mediaFinal() {
		double media = nota1 + nota2 + nota3;	
		return media;
	}	
}
