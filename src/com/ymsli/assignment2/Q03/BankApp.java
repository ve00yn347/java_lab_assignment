package com.ymsli.assignment2.Q03;

/*
	Test Class (BankApp)
	Demonstrate:
	
	Creating Savings and Current accounts
	Deposits & withdrawals
	Balance checks
	Overdraft behavior
	Interest behavior
 */

public class BankApp {

    public static void main(String[] args) {
    	
        System.out.println("Savings Account Test");
        Account sa = new SavingsAccount("Alice", 101, 10000);

        sa.deposit(5000);

        sa.withdraw(7000);

        sa.withdraw(4000);

        System.out.println("Balance with interest: " + sa.getBalance());

        System.out.println();

        System.out.println("Current Account:");
        
        Account ca = new CurrentAccount("Bob", 201, 5000, "TLN123", 2000);

        ca.deposit(3000);

        ca.withdraw(7000);

        ca.withdraw(2500);

        ca.withdraw(1000);
        
        System.out.println("Current balance: " + ca.getBalance());
    }
}
