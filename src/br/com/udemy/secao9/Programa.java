package br.com.udemy.secao9;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial [S/N]? ");
		char escolha = sc.next().charAt(0);
		
		if (escolha == 'S') {
			System.out.print("Digite o valor que deseja depositar: ");
			double depositoInicial = sc.nextDouble();
			Conta c = new Conta(numero, nome, depositoInicial);
			
			System.out.println();
			System.out.println("DADOS DA CONTA:");
			System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", c.getNumero(), c.getNome(), c.getSaldo());
			
			System.out.println();
			System.out.print("Digite o valor que deseja depositar: ");
			double deposito = sc.nextDouble();
			c.Depositar(deposito);
			System.out.println("ATUALIZAÇÃO DOS DADOS DA CONTA:");
			System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", c.getNumero(), c.getNome(), c.getSaldo());
			
			System.out.println();
			System.out.print("Digite o valor que deseja sacar: ");
			double saque = sc.nextDouble();
			c.Sacar(saque);
			System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", c.getNumero(), c.getNome(), c.getSaldo());
			
		} else {
			Conta c = new Conta(numero, nome);
			
			System.out.println();
			System.out.println("DADOS DA CONTA:");
			System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", c.getNumero(), c.getNome(), c.getSaldo());
			
			System.out.println();
			System.out.print("Digite o valor que deseja depositar: ");
			double deposito = sc.nextDouble();
			c.Depositar(deposito);
			System.out.println("ATUALIZAÇÃO DOS DADOS DA CONTA:");
			System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", c.getNumero(), c.getNome(), c.getSaldo());
			
			System.out.println();
			System.out.print("Digite o valor que deseja sacar: ");
			double saque = sc.nextDouble();
			c.Sacar(saque);
			System.out.printf("Conta: %d, Titular: %s, Saldo: $ %.2f%n", c.getNumero(), c.getNome(), c.getSaldo());
			
		}
		
		
		
		System.out.print("");
		
		
		
		sc.close();
	}
}
