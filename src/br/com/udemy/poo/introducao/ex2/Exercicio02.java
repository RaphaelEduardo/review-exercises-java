package br.com.udemy.poo.introducao.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		double salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		double descontoSalario = sc.nextDouble();
		System.out.println();
		
		Funcionario f = new Funcionario(nome, salarioBruto, descontoSalario);
		
		f.salarioLiquido();
		System.out.printf("Funcionário: %s, $ %.2f%n", f.nome, f.salario);
		
		System.out.println();
		System.out.println("Quantos porcento de aumento deseja dar? ");
		double aumento = sc.nextDouble();
		
		System.out.println();
		f.salarioFinal(aumento, salarioBruto);
		System.out.printf("Funcionário: %s, $ %.2f%n", f.nome, f.salario);
		
		sc.close();
	}
}
