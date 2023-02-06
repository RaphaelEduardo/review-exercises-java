package br.com.udemy.poo.introducao.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double n1, n2, n3;

		nome = sc.nextLine();
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();

		Aluno a = new Aluno(nome, n1, n2, n3);

		double faltam;
		if (a.mediaFinal() < 60) {
			faltam = 60 - a.mediaFinal();
			System.out.printf("MEDIA FINAL: %.2f%n", a.mediaFinal());
			System.out.println("REPROVADO");
			System.out.printf("FALTAM %.2f PONTOS %n", faltam);
		} else {
			System.out.printf("MEDIA FINAL: %.2f%n", a.mediaFinal());
			System.out.println("APROVADO");

			sc.close();
		}
	}
}
