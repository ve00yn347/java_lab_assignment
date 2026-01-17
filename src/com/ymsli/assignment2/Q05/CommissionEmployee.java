package com.ymsli.assignment2.Q05;

public class CommissionEmployee extends Employee{
	private int commissionRate;
	private int totalSales;
	
	public int getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(int commissionRate) {
		this.commissionRate = commissionRate;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	public CommissionEmployee(String empId, String name, int commissionRate, int totalSales) {
		super(empId, name);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
	}
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return commissionRate*totalSales/100;
	}
	
}
