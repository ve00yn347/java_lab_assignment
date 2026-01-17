package com.ymsli.assignment2.Q05;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new SalariedEmployee("E101", "Alice", 8000));
        employees.add(new HourlyEmployee("E102", "Bob", 40, 200));
        employees.add(new CommissionEmployee("E103", "Charlie", 10, 50000));
        
        Iterator<Employee> it = employees.iterator();
        
        while(it.hasNext()) {
        	Employee emp = it.next();
        	System.out.println("Employee ID: "+ emp.getEmpId()+ " Name: "+ emp.getName() 
        	+" Salary: "+ emp.getPayment());
        }
	}
}
