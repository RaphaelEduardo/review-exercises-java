package br.udemy.secao14.fixacao2;

public class Company extends TaxPayer {
	
	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}



	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double totalTax;
		if (getNumberOfEmployees() <= 10) {
			totalTax = getAnualIncome() * 0.16; 
			return totalTax;
		} else {
			totalTax = getAnualIncome() * 0.14;
			return totalTax;
		}
	}
	
	
}
