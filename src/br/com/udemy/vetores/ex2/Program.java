package br.com.udemy.vetores.ex2;

import java.util.Locale;
import java.util.Scanner;

//soma_vetor
public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		double soma = 0, media;
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		media = soma/vetor.length;
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}
}
