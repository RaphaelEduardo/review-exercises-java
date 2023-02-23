package br.com.udemy.map.exercicioproposto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> votacao = new TreeMap<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String nome = fields[0];
				int voto = Integer.parseInt(fields[1]);
				
				if (votacao.containsKey(nome)) {
					int qtdVotos = votacao.get(nome);
					votacao.put(nome, voto + qtdVotos);
				}
				else {
					votacao.put(nome, voto);
				}
				
				line = br.readLine();
			}
			for (String chave : votacao.keySet()) {
				System.out.println(chave + ": " + votacao.get(chave));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
		
		

	}

}
