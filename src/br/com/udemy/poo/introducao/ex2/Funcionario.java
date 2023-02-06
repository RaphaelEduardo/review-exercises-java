package br.com.udemy.poo.introducao.ex2;

public class Funcionario {

	public String nome;
	public double salario;
	public double imposto;
	
	public Funcionario(String nome, double salario, double imposto) {
		this.nome = nome;
		this.salario = salario;
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return salario = salario - imposto;
	}
	
	public double salarioFinal(double aumento, double salarioBruto) {
		aumento = aumento/100;
		aumento = salarioBruto * aumento;
		return salario = salario + aumento;
	}
}
