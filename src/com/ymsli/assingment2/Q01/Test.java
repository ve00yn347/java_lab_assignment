package com.ymsli.assingment2.Q01;

public class Test {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		System.out.println("Radius: "+ circle.getRadius()+ " Area: "+ circle.getArea());
		
		Circle circleNew = new Circle(5.3);
		System.out.println("Radius: "+ circleNew.getRadius()+ " Area: "+ circleNew.getArea());
	}
	
	
}
