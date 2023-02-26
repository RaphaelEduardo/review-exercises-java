package br.com.udemy.steam.resolucao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.udemy.steam.resolucao.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			/*
			 * 1. Transforma a lista em Steam.
			 * 2. Para cada Preço de produto, somar de todos e dividir pelo tamanho
			 * do Steam/Lista
			 * 3. Armazena tudo isso na variavel Média.
			 */
			double average = list.stream().map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Average price: R$ " + String.format("%.2f", average));
			
			/*
			 * 1. Compara os objetos pelo nome
			 * 2. Utilizando o .toUpperCase() para colocar todas a letras em caixa alta
			 *  e ser feita uma comparação mais eficiente entre os objetos.
			 */
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			/*
			 * 1. Transforma a lista em Steam
			 * 2. Filtra a lista de acordo com os parametros desejados
			 * 3. Organiza a lista de acordo com os parametros desejados, nesse caso foi de forma decrescente (reverserd)
			 * 4. Por fim transforma o Steam em lista novamente.
			 */
			List<String> names = list.stream().filter(p -> p.getPrice() < average)
					.map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
