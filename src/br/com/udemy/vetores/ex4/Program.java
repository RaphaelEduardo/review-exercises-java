package br.com.udemy.vetores.ex4;

import java.util.Locale;
import java.util.Scanner;

// numeros_pares
public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt(); 
		}
		
		System.out.println("NUMEROS PARES: ");
		int contador = 0;
		for (int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				contador += 1;
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contador);
		
		
		
		sc.close();
	}
}
