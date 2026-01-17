package com.ymsli.assignment2.Q03;

/*
	Base Class: Account
	Attributes
	name
	accountNumber
	accountBalance
	Methods
	deposit(double amount) → increases balance
	withdraw(double amount) → to be overridden
	Getters/setters as required
 */

public abstract class Account {
	private String name;
	private int accountNumber;
	private double accountBalance;
	

	public Account() {
		this.name = "";
		this.accountNumber = 0;
		this.accountBalance = 0;
	}
	
	public Account(String name, int accountNumber, double accountBalance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
		if(amount>0) {
			accountBalance+=amount;
			System.out.println("Amount deposited successfully");
		} else {
			System.out.println("Invalid amount");
		}
		
	}
	public abstract double getBalance();
	public abstract void withdraw(double amount);
}


