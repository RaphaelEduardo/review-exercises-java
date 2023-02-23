package br.com.udemy.set.exercicioproposto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int x = sc.nextInt();
		for (int i=0; i<x; i++) {
			int courseA = sc.nextInt();
			a.add(courseA);
		}
		System.out.println();
		System.out.print("How many students for course B?");
		int y = sc.nextInt();
		for (int i=0; i<y; i++) {
			int courseB = sc.nextInt();
			b.add(courseB);
		}
		
		System.out.println();
		System.out.print("How many students for course C?");
		int z = sc.nextInt();
		for (int i=0; i<z; i++) {
			int courseC = sc.nextInt();
			c.add(courseC);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println();
		System.out.println("Total Students: " + total.size());
		
		sc.close();
	}

}
