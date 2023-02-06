package br.com.udemy.vetores.ex9;

import java.util.Locale;
import java.util.Scanner;

//mais_velho
public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			vetor[i] = new Pessoa(nome, idade);
		}
		
		int contador = 0;
		String maisVelho = null;
		for (int i=0; i<n; i++) {
			if (vetor[i].idade > contador) {
				contador = vetor[i].idade;
				maisVelho = vetor[i].nome;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		
		sc.close();
	}
}
