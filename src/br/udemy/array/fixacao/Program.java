package br.udemy.array.fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee e = new Employee(id, name, salary);
			list.add(e);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Integer idPosition = position(list, idSalary); 
		
		if(idPosition == null) {
			System.out.println("This id does not exist!");
		} 
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(idPosition).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}
		
		sc.close();
	}
	//Função para retornar a posição do funcionário na lista.
	public static Integer position(List<Employee> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			} 
		}
		return null;
	}
	
	// Verifica se o ID já existe na lista.
	public static boolean hasId(List<Employee> list, int id) {
		Employee e = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return e != null;
	}
}
