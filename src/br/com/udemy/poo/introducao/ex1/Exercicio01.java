package br.com.udemy.poo.introducao.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura e a altura do retangulo: ");
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		
		Retangulo r = new Retangulo(largura, altura);
		
		System.out.printf("AREA: %.2f%n", r.Area());
		System.out.printf("PERIMETRO: %.2f%n", r.Perimetro());
		System.out.printf("DIAGONAL: %.2f%n", r.Diagonal());
		
		sc.close();
	}
}
