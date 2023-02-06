package br.com.udemy.estruturarepetitiva.w;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int x, y;
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else {
				break;
			}			
		}
		
		sc.close();
	}
}
