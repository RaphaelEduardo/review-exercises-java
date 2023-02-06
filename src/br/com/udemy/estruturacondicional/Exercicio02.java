package br.com.udemy.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		if (entrada % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}
}
