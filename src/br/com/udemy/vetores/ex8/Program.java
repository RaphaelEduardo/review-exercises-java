package br.com.udemy.vetores.ex8;

import java.util.Locale;
import java.util.Scanner;

//media_pares
public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		double soma = 0, media, contador = 0;
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				contador += 1;
			}
		}
		
		if (contador == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			media = soma / contador;
			System.out.println("MÉDIA DOS PARES = " + media);
		}
		
		sc.close();
	}
}
