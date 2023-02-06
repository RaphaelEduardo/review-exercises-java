package br.com.udemy.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double salario = sc.nextDouble();
		
		double salarioFinal = horasTrabalhadas * salario;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.println("SALARY = U$ " + salarioFinal);
		
		sc.close();
	}

}
