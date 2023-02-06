package br.com.udemy.poo.introducao.ex1;

public class Retangulo {

	public double largura;
	public double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		return (largura * 2) + (altura * 2);
	}
	
	public double Diagonal() {
		double diagonal = (largura*largura) + (altura*altura);
		return Math.sqrt(diagonal);
	}
}
