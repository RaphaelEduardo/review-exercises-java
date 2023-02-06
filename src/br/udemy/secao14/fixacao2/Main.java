package br.udemy.secao14.fixacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c): ");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Anual income: ");
				double income = sc.nextDouble();

				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				TaxPayer tp = new Individual(name, income, healthExpenditures);
				list.add(tp);
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Anual income: ");
				double income = sc.nextDouble();

				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();

				TaxPayer tp = new Company(name, income, numberEmployees);
				list.add(tp);
			}
		}

		System.out.println("");
		System.out.println("TAXES PAID:");

		double totalTaxes = 0;
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			totalTaxes += tp.tax();
		}

		System.out.println("");
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

		sc.close();
	}
}
