package br.com.udemy.estruturarepetitiva.w;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		
		while (true) {
			int entrada = sc.nextInt();
			if (entrada == senha) {
				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}
		}
		
		sc.close();
	}
}
