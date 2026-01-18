package com.ymsli.assignment4.Q04;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		// TODO Auto-generated method stub
		return Double.compare(product1.getProductPrice(), product2.getProductPrice());
	}
	
}
