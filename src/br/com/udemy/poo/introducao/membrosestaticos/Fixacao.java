package br.com.udemy.poo.introducao.membrosestaticos;

import java.util.Locale;
import java.util.Scanner;

public class Fixacao {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor, precoDolar, resultado;
		
		
		System.out.print("Qual o preço do dolar? ");
		precoDolar = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados? ");
		valor = sc.nextDouble();
		
		resultado = ConversorDeMoeda.dolarParaReal(valor, precoDolar);
		System.out.printf("O valor a ser pago em reais é: %.2f%n", resultado);
		
		sc.close();
	}
}
