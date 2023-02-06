package br.com.udemy.vetores.ex11;

import java.util.Locale;
import java.util.Scanner;

//dados_pessoas
public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
		
		double menorAltura = 10, maiorAltura = 0, mediaMulheres = 0, somaMulheres = 0;
		int numeroHomens = 0, contadorMulheres = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			
			System.out.print("Sexo da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			char sexo = sc.next().charAt(0);
			
			vetor[i] = new Pessoa(altura, sexo);
		}
		
		for (int i=0; i<n; i++) {
			if (vetor[i].sexo ==  'F') {
				somaMulheres += vetor[i].altura;
				contadorMulheres += 1;
			} else if (vetor[i].sexo ==  'M') {
				numeroHomens += 1;
			}   
		}
		
		mediaMulheres = somaMulheres / contadorMulheres;
		
		for (int i=0; i<n; i++) {
			if (vetor[i].altura > maiorAltura) {
				maiorAltura = vetor[i].altura;
			} else if (vetor[i].altura < menorAltura) {
				menorAltura = vetor[i].altura;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média de altura das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Número de homens = " + numeroHomens);
		
		sc.close();
	}
}
