package com.ymsli.assignment2.Q05;

import java.util.ArrayList;

public class PaymentsApp {
	public static void main(String[] args) {
		ArrayList<Payable> payments = new ArrayList<>();

		payments.add(new SalariedEmployee("E101", "Alice", 8000));
		payments.add(new HourlyEmployee("E102", "Bob", 40, 200));
		payments.add(new CommissionEmployee("E103", "Charlie", 10, 50000));

		payments.add(new Invoice("INV01", "Laptop", 2, 45000));
		payments.add(new Invoice("INV02", "Printer", 1, 15000));
		payments.add(new Invoice("INV03", "Office Chair", 5, 3500));
		payments.add(new Invoice("INV04", "Projector", 1, 60000));
		payments.add(new Invoice("INV05", "Stationery Set", 10, 250));

		payments.stream().forEach(pay -> {
			{
				if (pay instanceof Employee) {
					Employee emp = (Employee) pay;
					System.out.println("Employee [" + emp.getEmpId() + ", " + emp.getName() + "]");
				} else if (pay instanceof Invoice) {
					Invoice invoice = (Invoice) pay;
					System.out.println("Invoice [" + invoice.getInvoiceId() + ", " + invoice.getItemDescription() + "]");
				}
				System.out.println("Payable amount: " + pay.getPayment());
			}
		});
	}
}
