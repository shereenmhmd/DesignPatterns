package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Product> products;
	ShoppingCart(){
		products = new ArrayList<Product>();
	}
	
	void addProduct(Product product){
		
		if(products.add(product))
			System.out.println("product added: " + product);
		
	}
	
	void removeProduct(Product product){
		
		if(products.remove(product))
			System.out.println("product removed: " + product);
		
	}
	
	void pay(Payment paymentAlgorithm) {
		int amount = 0;
		for (Product product : products) {
			amount += product.getPrice();
		}
		paymentAlgorithm.pay(amount);
		
	}

}
