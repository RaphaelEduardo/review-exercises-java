package br.com.udemy.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		
		if (entrada >= 0) {
			System.out.println("NAO NEGATIVO");
		} 
		else {
			System.out.println("NEGATIVO");
		}

		sc.close();
	}
}
