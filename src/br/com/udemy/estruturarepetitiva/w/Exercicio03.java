package br.com.udemy.estruturarepetitiva.w;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, entrada;
		
		while (true) {
		
			entrada = sc.nextInt();

			if (entrada == 1) {
				alcool += 1;

			} else if (entrada == 2) {
				gasolina += 1;

			} else if (entrada == 3) {
				diesel += 1;

			} else if (entrada == 4) {
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
