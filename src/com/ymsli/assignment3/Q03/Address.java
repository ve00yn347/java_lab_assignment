package com.ymsli.assignment3.Q03;

import java.io.Serializable;

public class Address implements Serializable{
	private String houseNo;
	private String street;
	private String city;
	private String state;
	
	public Address(String houseNo, String street, String city, String state) {
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	
	public String toString() {
		return houseNo + ", " + street + ", " + city + ", " + state;
	}
}
