package br.udemy.secao14.fixacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> prod = new ArrayList<>();	
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported? (c/u/i) ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				Product p = new Product(name, price);
				prod.add(p);
			}
			else if (ch == 'u') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				Product p = new UsedProduct(name, price, date);
				prod.add(p);
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				System.out.print("Customs fee: ");
				double cf = sc.nextDouble();
				
				Product p = new ImportedProduct(name, price, cf);
				prod.add(p);
			}
			
		}
		System.out.println("");
		System.out.println("PRICE TAGS:");
		for (Product p : prod) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}
