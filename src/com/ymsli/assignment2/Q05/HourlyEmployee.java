package com.ymsli.assignment2.Q05;

public class HourlyEmployee extends Employee{
	private int hoursWorked;
	private int hourlyRate;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public HourlyEmployee(String empId, String name, int hoursWorked, int hourlyRate) {
		super(empId, name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return hoursWorked*hourlyRate;
	}
}
