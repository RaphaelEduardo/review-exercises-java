package br.com.udemy.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int inicio, fim, total;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio >= fim) {
			fim += 24;
			total = fim - inicio;
			System.out.println("O JOGO DUROU " + total + " HORA(S)");
		} else {
			total = fim - inicio;
			System.out.println("O JOGO DUROU " + total + " HORA(S)");
		}

		sc.close();
	}
}
