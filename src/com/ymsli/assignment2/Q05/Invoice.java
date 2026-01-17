package com.ymsli.assignment2.Q05;

public class Invoice implements Payable{
	private String invoiceId;
	private String itemDescription;
	private int quantity;
	private double pricePerUnit;

	public Invoice(String invoiceId, String itemDescription, int quantity, double pricePerUnit) {
		super();
		this.invoiceId = invoiceId;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	
	public String getInvoiceId() {
		return invoiceId;
	}

	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPricePerUnit() {
		return pricePerUnit;
	}


	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	@Override
	public double getPayment() {
		return quantity*pricePerUnit;
	}
	
}
