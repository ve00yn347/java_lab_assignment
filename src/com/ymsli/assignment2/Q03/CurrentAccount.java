package com.ymsli.assignment2.Q03;

/*
	CurrentAccount (extends Account)
	Additional Attributes
	tradeLicenseNumber
	overdraft (allow negative balance until overdraft limit)
	Required Methods
	getBalance()
	Return the current balance without interest.
	
	withdraw(double amount)
	Allow if:
	
	amount <= accountBalance + overdraft
	Else display:
	
	Withdrawal exceeds overdraft limit.
 */

public class CurrentAccount extends Account {
	private String tradeLicenseNumber;
	private double overDraft;
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(String name, int accountNumber, double accountBalance, String tradeLicenseNumber, double overDraft) {
	    super(name, accountNumber, accountBalance);
	    this.tradeLicenseNumber = tradeLicenseNumber;
	    this.overDraft = overDraft;
	}

	public String getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}

	public void setTradeLicenseNumber(String tradeLicenseNumber) {
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	
	public double getBalance() {
		return getAccountBalance();
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount<= getAccountBalance() + overDraft) {
			setAccountBalance(getAccountBalance() - amount);
			System.out.println("Amount withdrawn successfully");
		}
		else {
			System.out.println("Withdrawal exceeds overdraft limit");
		}
	}
}
