package com.ymsli.assignment3.Q05;

public class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		// TODO Auto-generated constructor stub
		super("User Outside India cannot be registered");
	}
	public InvalidCountryException(String message) {
		super(message);
	}
}
