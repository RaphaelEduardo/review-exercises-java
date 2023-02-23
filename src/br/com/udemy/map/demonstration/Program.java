package br.com.udemy.map.demonstration;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	
	public static void main(String[] args) {
		
		// TreeMap ordena pela chave
		Map<String, String> cookies = new TreeMap<>();
		
		// insere <chave , valor>
		cookies.put("username", "Raphael");
		cookies.put("email", "raphael@gmail.com");
		cookies.put("phone", "999996666");
		
		
		// remove pela <chave>
		cookies.remove("email");
		// o Map não admite repetição da chave
		cookies.put("phone", "888883333");
		// então vai sobrepor o valor da chave phone
		
		// containsKey(), retorna se contem determinada chave  
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		// get(), retorna o valor da chave passada. 
		System.out.println("Phone number: " + cookies.get("phone"));
		
		// ao buscar uma chave 'inexistente', o retorno será 'null'
		System.out.println("Email: " + cookies.get("email"));
		
		// retorna o tamanho do Map
		System.out.println("Size: " + cookies.size());
		
		System.out.println();
		System.out.println("ALL COOKIES:");
		// keySet() retorna um set<chave)
		for (String key : cookies.keySet()) {
			// imprime a chave e o valor
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
