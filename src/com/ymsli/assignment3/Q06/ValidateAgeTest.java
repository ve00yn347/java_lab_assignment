package com.ymsli.assignment3.Q06;

public class ValidateAgeTest {
	public static void main(String[] args) throws InvalidAgeException{
		
		try {
			if(args.length < 2) {
				System.out.println("Invalid input");
				return;
			}
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			if(age<18 || age>59) {
				throw new InvalidAgeException("Age must be between 18 and 59");
			}
			System.out.println("Name: " + name + ", Age: " + age);
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println(e.getClass().getSimpleName()
                    + ": " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
