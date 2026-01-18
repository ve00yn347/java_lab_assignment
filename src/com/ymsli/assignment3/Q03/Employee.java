package com.ymsli.assignment3.Q03;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empId;
	private String name;
	private Address address;
	private transient double salary;
	
	public Employee(int empId, String name, Address address, double salary) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee ID : " + empId+ " Name: " + name+ " Address: " + address+
				" Salary: " + salary);
	}
	
}

