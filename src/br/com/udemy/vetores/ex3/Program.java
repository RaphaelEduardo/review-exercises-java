package br.com.udemy.vetores.ex3;

import java.util.Locale;
import java.util.Scanner;

//alturas
public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0, media;
		for(int i=0; i<n; i++) {
			soma += vetor[i].altura;
		}
		media = soma/vetor.length;
		System.out.printf("Altura média: %.2f%n", media);
		
		double contador = 0, porcentagem;
		for(int i=0; i<n; i++) {
			if (vetor[i].idade < 16) {
				contador += 1;
			}
		}
		porcentagem = (contador/vetor.length) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f", porcentagem);
		System.out.println("%");
	
		for(int i=0; i<n; i++) {
			if (vetor[i].idade < 16) {
				System.out.println(vetor[i].nome);
			}
		}
		
		
		
		
		
		
		sc.close();
	}
}
