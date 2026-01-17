package com.ymsli.assignment2.Q05;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	

	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public SalariedEmployee(String empId, String name, double weeklySalary) {
		// TODO Auto-generated constructor stub
		super(empId,name);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}
}
