package com.ymsli.assignment2.Q03;

/*
SavingsAccount (extends Account)
Additional Attributes
interest = 5 (fixed 5%)
maxWithdrawLimit = accountBalance
Minimum balance allowed: ₹5000
Required Methods
getBalance()

Must calculate:
return accountBalance + (accountBalance * interest / 100)
Must NOT change accountBalance.
withdraw(double amount)
Allow withdrawal only if:

amount ≤ maxWithdrawLimit
balance after withdrawal ≥ 5000
Else print meaningful error messages.
*/

public class SavingsAccount extends Account{
	private final int interest = 5;
	private final double minBalanceAllowed = 5000;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(String name, int accountNumber, double accountBalance) {
	    super(name, accountNumber, accountBalance);
	}
	
	public double getBalance() {
		double accountBalance = getAccountBalance();
		return accountBalance + (accountBalance*interest/100);
	}
	
	@Override
	public void withdraw(double amount) {

		if(amount > getAccountBalance()) {
		    System.out.println("Withdrawal failed: Amount exceeds available balance");
		} else if(getAccountBalance() - amount < minBalanceAllowed) {
		    System.out.println("Withdrawal failed: Minimum balance of ₹5000 must be maintained");
		} else {
		    setAccountBalance(getAccountBalance() - amount);
		    System.out.println("Amount withdrawn successfully");
		}
	}
}
