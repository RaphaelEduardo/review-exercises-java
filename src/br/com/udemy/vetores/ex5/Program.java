package br.com.udemy.vetores.ex5;

import java.util.Locale;
import java.util.Scanner;

//maior_posicao
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
		
		double maior = 0;
		int posicao = 0;
		for (int i=0; i<n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}
}
