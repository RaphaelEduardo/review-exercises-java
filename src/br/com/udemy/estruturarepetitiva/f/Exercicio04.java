package br.com.udemy.estruturarepetitiva.f;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a, b, divisao;
		
		for (int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (b != 0) {
				divisao = a/b;
				System.out.println(divisao);
			} else {
				System.out.println("divisao impossivel");
			}	
		}
		
		sc.close();
	}
}
