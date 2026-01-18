package com.ymsli.assignment4.Q04;

import java.util.PriorityQueue;

public class ProductTest {
	public static void main(String[] args) {
		PriorityQueue<Product> productQueue = new PriorityQueue<>(new ProductPriceComparator());
		
		productQueue.add(new Product(101, "Pen", 10.0));
        productQueue.add(new Product(102, "Notebook", 25.0));
        productQueue.add(new Product(103, "Bag", 400.0));
        productQueue.add(new Product(104, "Laptop", 60000.0));
        productQueue.add(new Product(105, "Mouse", 500.0));
        
        while(!productQueue.isEmpty()) {
        	Product product = productQueue.poll();
        	System.out.println("Processing product: "+product);;
        }
	}
}
