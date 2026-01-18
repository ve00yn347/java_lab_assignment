package com.ymsli.assignment3.Q05;


public class UserRegistrationTest {
	public static void registerUser(String username, String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India") || userCountry.equals("india")){
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
	}
	public static void main(String[] args){
		String username1 = "xsfe";
		String userCountry1 = "usa";
		String username2 = "fds";
		String userCountry2 = "India";
		try {
			registerUser(username1, userCountry1);
		} catch (InvalidCountryException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			registerUser(username2, userCountry2);
		} catch (InvalidCountryException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
