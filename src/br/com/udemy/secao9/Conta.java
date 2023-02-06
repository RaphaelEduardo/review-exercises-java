package br.com.udemy.secao9;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = depositoInicial;
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double Depositar(double deposito) {
		this.saldo = this.saldo + deposito;
		return getSaldo();
	}
	
	public double Sacar(double saque) {
		double taxa = 5.00;
		this.saldo = this.saldo - (saque + taxa);
		return getSaldo();
	}
	
	
	
}
