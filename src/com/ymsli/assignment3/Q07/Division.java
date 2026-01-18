package com.ymsli.assignment3.Q07;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println("The quotient of "+ a+"/"+b+ " is "+ a/b);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Inside finally block");
		}
		sc.close();
	}
}
