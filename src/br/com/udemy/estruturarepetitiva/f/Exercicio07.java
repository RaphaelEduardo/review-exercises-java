package br.com.udemy.estruturarepetitiva.f;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int quadrado, cubo;
		
		for (int i=1; i<=n; i++) {
			quadrado = i * i;
			cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
	}
}
