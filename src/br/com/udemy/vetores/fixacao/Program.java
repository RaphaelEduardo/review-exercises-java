package br.com.udemy.vetores.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int entrada = sc.nextInt();
		
		for (int i=0; i<entrada; i++) {
			System.out.println("Aluguel #" + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			
			vect[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println("Registro de quartos: ");

		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
