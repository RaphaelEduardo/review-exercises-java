package br.com.udemy.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
