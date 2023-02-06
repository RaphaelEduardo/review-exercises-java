package br.com.udemy.estruturarepetitiva.f;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a, b, c, media;
		
		for (int i=0; i<n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("%.1f%n",media);
		}
		
		sc.close();
	}
}
