package br.com.udemy.secao15.fixacao;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit)  throws DomainException {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if (amount > getWithdrawLimit()) {
			throw new DomainException ("The amount exceeds withdraw limit."); 
		}
		if (amount > getBalance()) {
			throw new DomainException("Not enough balance.");
		}
		else {
			balance -= amount;
			toString();
		}
		
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", getBalance());
	}
	
	
}
