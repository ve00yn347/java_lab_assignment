package com.ymsli.assignment2.Q05;

public abstract class Employee implements Payable{
	private String empId;
	private String name;
	
	public String getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Employee(String empId, String name){
		this.empId = empId;
		this.name = name;
	}
	
//	public abstract double getPayment();
}
