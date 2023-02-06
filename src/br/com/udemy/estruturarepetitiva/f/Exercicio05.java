package br.com.udemy.estruturarepetitiva.f;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i=0; i<n; i++) {
			fatorial *= n-i;
		}
		System.out.println(fatorial);
		
		sc.close();
	}
}
