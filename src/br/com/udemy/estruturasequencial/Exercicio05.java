package br.com.udemy.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// int codigo1, codigo2; 
		int numero1, numero2;
		double valor1, valor2, total;

		// codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();

		// codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();

		total = (numero1 * valor1 + numero2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}

}
